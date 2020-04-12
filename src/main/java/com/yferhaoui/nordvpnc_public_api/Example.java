package com.yferhaoui.nordvpnc_public_api;

import java.io.IOException;

import com.yferhaoui.nordvpnc_public_api.data.Country;
import com.yferhaoui.nordvpnc_public_api.data.NordVPNServer;

public final class Example {

	public final static void main(final String[] args) throws IOException, InterruptedException {

		final NordVPNAPI client = new NordVPNAPI();

		// Get all country in which NordVPN servers are available
		final Country[] countries = client.getCountries();

		System.out.println("All country in which NordVPN servers are available : ");
		for (final Country country : countries) {
			System.out.println("   " + country.getID() + ":" + country.getCode());
		}

		// Get all available worldwide servers
		final NordVPNServer[] servers = client.getServerList();

		System.out.println("\nAll available worldwide servers : ");
		for (final NordVPNServer server : servers) {
			System.out.println("   " + server.getID() + ":" + server.getDomain());
		}

		// Get all available country servers
		final String country = "FR";
		final NordVPNServer[] countryServers = client.getCountryServerList(country);

		System.out.println("\nAll available " + country + " servers : ");
		for (final NordVPNServer server : countryServers) {
			System.out.println("   " + server.getID() + ":" + server.getDomain());
		}

		// Get random worldwide server
		final NordVPNServer randServer = client.getRandServer();
		System.out.println("\nRandom server : ");
		System.out.println("   " + randServer.getID() + ":" + randServer.getDomain());

		// Get random country server
		final String country2 = "US";
		final NordVPNServer randCountryServer = client.getRandServer(country2);
		System.out.println("\nRandom server in " + country2 + " : ");
		System.out.println("   " + randCountryServer.getID() + ":" + randCountryServer.getDomain());

		// Check if server domain is valid
		final String serverDomain = randServer.getDomain(); // Example: "fr523.nordvpn.com"
		final boolean isAvailable = client.serverDomainIsValid(serverDomain);
		System.out.println("\nServer " + serverDomain + (isAvailable ? " is online !" : " is not online !"));
	}
}
