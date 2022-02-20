# TechnoCraft official API repository

To get you API key, join on server and use command, `/api getkey`, and server will give to you it.

API Usage:
```java
final TechnoCraftApi api = TechnoCraftApi.create("<Your api key here>"); // create our main caller
final ServerMode skyblock = api.serverMode("skyblock"); // to get information about skyblock server, for example
LOGGER.info(() -> "Skyblock online: " + skyblock.currentOnline()); // print info about skyblock server

// all methods related with user's information may throw o.t.a.e.InformationIsHiddenException,
// this will indicate that it's hidden for you (All api keys are related with your account,
// and you can share some information with your friends or fully hide it)

final TechnoPlayer player = api.player("<Someone UUID here>"); // or use #getPlayerByName(String)

// user contains few profiles for each mode,
// currently there is 2 getters for BedWars and SkyBlock
// TechnoPlayer#bedWarsProfile() & TechnoPlayer#skyBlockProfile()

// example usage
final BedWarsProfile bedWars = player.bedWarsProfile();
LOGGER.info(() -> player.username() + " has " + bedwars.kills() + " kills in BedWars!");

// to get more information visit official java docs, https://apidocs.techno-craft.org/
```

Official docs: [Click](https://apidocs.techno-craft.org/)