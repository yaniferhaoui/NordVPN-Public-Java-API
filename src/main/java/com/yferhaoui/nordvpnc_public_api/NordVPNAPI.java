package com.yferhaoui.nordvpnc_public_api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.yferhaoui.nordvpnc_public_api.data.Country;
import com.yferhaoui.nordvpnc_public_api.data.NordVPNServer;

public final class NordVPNAPI {

	private final static String SERVER_STAT_URL = "https://api.nordvpn.com/server/stats";

	// Http Objects
	private final HttpClient client = HttpClient.newBuilder()//
			.connectTimeout(Duration.ofSeconds(60))//
			.followRedirects(Redirect.NEVER)//
			.version(Version.HTTP_2)//
			.build();

	private final HttpRequest httpServerListRequest = HttpRequest.newBuilder()//
			.uri(URI.create("https://nordvpn.com/api/server"))//
			.GET()//
			.build();

	private final HttpRequest httpCountryListRequest = HttpRequest.newBuilder()//
			.uri(URI.create("https://api.nordvpn.com/v1/servers/countries"))//
			.GET()//
			.build();

	private final Gson gson = new Gson();

	/**
	 * Request Methods
	 */

	// Get all country in which NordVPN servers are available
	public final Country[] getCountries() throws IOException, InterruptedException {

		final String response = this.client.send(this.httpCountryListRequest, BodyHandlers.ofString()).body();
		return this.gson.fromJson(response, Country[].class);
	}

	// Get all available worldwide servers
	public final NordVPNServer[] getServerList() throws IOException, InterruptedException {

		final String response = this.client.send(this.httpServerListRequest, BodyHandlers.ofString()).body();
		return this.gson.fromJson(response, NordVPNServer[].class);
	}

	// Get all available country servers
	public final NordVPNServer[] getCountryServerList(final String countryCode)
			throws IOException, InterruptedException {

		final NordVPNServer[] servers = this.getServerList();
		return Arrays.stream(servers)//
				.filter(o -> o.getFlag().equalsIgnoreCase(countryCode))//
				.toArray(NordVPNServer[]::new);
	}

	// Get random worldwide server
	public final NordVPNServer getRandServer() throws IOException, InterruptedException {

		final NordVPNServer[] servers = this.getServerList();
		final int randNumber = new Random().nextInt(servers.length);
		return servers[randNumber];
	}

	// Get random proxy server
	public final NordVPNServer getRandProxyServer() throws IOException, InterruptedException {

		final List<NordVPNServer> list = Arrays.asList(this.getServerList());
		Collections.shuffle(list);

		for (final NordVPNServer server : list) {

			if (server.getFeatures().isProxy()) {
				return server;
			}
		}
		throw new IOException("No Proxy server found !");
	}

	// Get random server in a specific country
	public final NordVPNServer getRandServer(final String countryCode) throws IOException, InterruptedException {

		final NordVPNServer[] servers = this.getCountryServerList(countryCode);
		final int randNumber = new Random().nextInt(servers.length);
		return servers[randNumber];
	}

	// Get random proxy server in a specific country
	public final NordVPNServer getRandProxyServer(final String countryCode) throws IOException, InterruptedException {

		final List<NordVPNServer> list = Arrays.asList(this.getCountryServerList(countryCode));
		Collections.shuffle(list);

		for (final NordVPNServer server : list) {

			if (server.getFeatures().isProxy()) {
				return server;
			}
		}
		throw new IOException("No Proxy server found in the country " + countryCode);
	}

	// Check if server domain is valid
	public final boolean serverDomainIsValid(final String serverDomain) throws IOException, InterruptedException {

		final NordVPNServer[] servers = this.getServerList();
		for (final NordVPNServer server : servers) {
			if (server.getDomain().equalsIgnoreCase(serverDomain)) {
				return true;
			}
		}
		return false; // Server not not found in the available servers
	}

	// Get percent bandwidth used on the server
	public final short getPercentBandwidthUsed(final String serverDomain) throws IOException, InterruptedException {

		final HttpRequest httpServerCountryStatRequest = HttpRequest.newBuilder()//
				.uri(URI.create(NordVPNAPI.SERVER_STAT_URL + "/" + serverDomain))//
				.GET()//
				.build();
		final String response = this.client.send(httpServerCountryStatRequest, BodyHandlers.ofString()).body();
		return this.gson.fromJson(response, Short.class);
	}

	public final static void main(final String[] args) throws IOException, InterruptedException {

		System.out.println("Server: " + new NordVPNAPI().getRandServer("FR").getDomain());

	}
}
