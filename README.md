# PteroBungee
## Description
Description being remade.
## How does this work?
For the "Starting..." status, the plugin creates a fake "Done" message, just like when a Spigot/Bukkit server finishes booting up. That message triggers the Pterodactyl "Online" status.
For the "Stop" button, this was an easier fix. It creates a command called `stop` that if called through console, it will stop the BungeeCord instance, and if called by a player, the plugin will force that player to execute `/minecraft:stop` on the current server they are in so administrators are still able to shut down Spigot/Bukkit instances.
## Features
- It's lightweight, only 4KB in size.
- As our testings show, RAM usage is only increased by 1MB.
- It's open source, you can modify it to your liking (it also includes an IntelliJ IDEA project file).
- It does not override the original `/stop` functionality in Bukkit/Spigot servers.
## How to install
1. Shut down your BungeeCord instance: first click on the Stop button on your Pterodactyl panel andthen type `end` in console.
2. Upload `PteroBungee-v1.2.0.jar` to the "plugins" folder.
3. Start the BungeeCord instance.
## Download
- Download from [Direct](https://data.harrydev.me/PteroBungee-1.2.0.jar).
- Download from [GitHub](https://github.com/sparkedhost/PteroBungee/releases).