# PteroBungee
## Description
This BungeeCord plugin fixes an incompatibility in some installations of the Pterodactyl panel, where setting up a Bungee instance would show the status as "Starting..." even when the server is online, and the Stop button wouldn't work.
## How does this work?
For the "Starting..." status, the plugin creates a fake "Done" message, just like when a Spigot/Bukkit server finishes booting up. That message triggers the Pterodactyl "Online" status.
For the "Stop" button, this was an easier fix. It creates a command called `stop` that if called through console, it will stop the BungeeCord instance, and if called by a player, the plugin will force that player to execute `/minecraft:stop` on the current server they are in so administrators are still able to shut down Spigot/Bukkit instances.
## Features
- It's lightweight, only 2,93KB in size.
- It's open source, you can modify it to your liking (it also includes an IntelliJ IDEA project file).
- It does not override the original `/stop` functionality.
## How to install
1. Shut down your BungeeCord instance: first click on the Stop button on your Pterodactyl panel andthen type `end` in console.
2. Upload `PteroBungee-v1.0.2.jar` to the "plugins" folder.
3. Start the BungeeCord instance.
## Download
- Download from [BetTD.me](https://builds.bettd.me/java/bungeecord/pterobungee/).
- Download from [GitHub](https://github.com/BetTD/PteroBungee/releases).

More mirrors are coming soon, for both Europe and America.
