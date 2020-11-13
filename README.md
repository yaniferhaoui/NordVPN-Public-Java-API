NordVPN Public Java API
========

Simple Java API which allows you to get some public NordVPN data in Java Objects.

Port used by NordVPN servers is always the port number 80 !

Functionalities
--------
```
 - Get all country in which NordVPN servers are available
 - Get all available worldwide servers
 - Get all available country servers
 - Get random worldwide server
 - Get random country server
 - Check if a server domain is valid
 - Get percent bandwidth used on a server
```

Usage
--------
```java
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

```

How to setup Java Proxy Settings with a NordVPN Server ?
--------
Most of the NordVPN servers can be used as Proxy !
Use port 80 and the server domain !

### System Proxy Setup Example :
```java

final String username = "yourNordVPNUsername";
final String password = "yourNordVPNPassword";

final NordVPNAPI client = new NordVPNAPI();
final NordVPNServer server = client.getRandProxyServer();

final String nordVPNServeurPort = "80"; // Always 80

System.setProperty("http.proxyHost", server.getDomain());
System.setProperty("http.proxyPort", nordVPNServeurPort);
System.setProperty("https.proxyHost", server.getDomain());
System.setProperty("https.proxyPort", nordVPNServeurPort);
System.setProperty("socksProxyHost", server.getDomain());
System.setProperty("socksProxyPort ", nordVPNServeurPort);

Authenticator.setDefault(new Authenticator() {
	@Override
	public final PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username,password.toCharArray());
	}
});

System.setProperty("http.proxyUser", username);
System.setProperty("http.proxyPassword", password);
System.setProperty("https.proxyUser", username);
System.setProperty("https.proxyPassword", password);
System.setProperty("java.net.socks.username", username); 
System.setProperty("java.net.socks.password", password); 
System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");

```
Data Sources (Json):
--------
- [Server worldwid list](https://nordvpn.com/api/server)
- [Server country list](https://api.nordvpn.com/v1/servers/countries) 
- [Server statistics](https://api.nordvpn.com/server/stats) 
