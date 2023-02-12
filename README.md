# PteroBungee
## Information
### How does this work?

This plugin aims to provide a workaround for two problems that usually arise when hosting 
a BungeeCord server on a server under the [Pterodactyl](https://pterodactyl.io/) panel,
more specifically while using a generic Minecraft: Java Edition egg, normally designed to
support the widest range possible of server software for the Java edition of the game.
Using these generic eggs is usually not a huge deal... except with BungeeCord. Of course,
it's always better to use an egg designed to support the JAR you're trying to run, in this
case BungeeCord (Pterodactyl includes an egg for BungeeCord by default), and if you have
the option to use it, either by asking your hosting company to change it for you or, if
you're self-hosting your own Pterodactyl instance, by changing it yourself, **take
advantage of it!**

The two problems that arise are:
 
- Being unable to stop the BungeeCord instance
- Server stuck in "Starting" status

Both of these problems, as mentioned above, are not present when using the appropriate egg,
only when using a generic one, which is what many hosting companies do by default.

This plugin fixes those two problems by literally adding a ``stop`` command, which,
when ran via the console, will stop the BungeeCord instance (when ran by a player, the
plugin will forward the stop command to the server that the player was on, it will not
actually stop that server unless the player that ran it has the permissions to do so),
and by printing in the console a **fake "Done" message**, which triggers the "Running"
status on most of those generic eggs.

### Wait... what's an egg? What does that have to do with these problems?

The team over at the Pterodactyl project defines it as follows:

> Each egg is usually used to store the configuration of a specific type of game,
> for example: Vanilla, Spigot or Bungeecord for Minecraft.

*Source: https://pterodactyl.io/project/terms.html*

Generally speaking, in the context of Pterodactyl, an egg is a list of settings that define
how the panel is going to interact with a server. Things like when to mark the server as
"Started" (causes problem #2), configuration options under the "Startup" tab, or what
commands to run in  order to start or stop a server.

This is a very vague description, there is way more to it than just that. Now you should be
able to see why those two problems occur though: virtually all Minecraft server software use
the command ``/stop`` (no slash when used via console) in order to stop the server instance.
The only exceptions to this rule are **proxy** software, like Velocity and BungeeCord (and
all of its forks, e.g. Waterfall).

The reason behind using a different command for these proxy instances is very simple:
typically, these instances sit on top of one or more regular Minecraft servers, which of
course need to be stopped with the ``/stop`` command. Do you see the problem yet? If not,
keep reading. If let's say BungeeCord decided to also use stop as the keyword to stop the
instance, instead of turning off the Minecraft server, you'd turn off the entire proxy. This
may not look like a huge issue, until you realize that these proxies are meant to connect
multiple Minecraft servers together to form what's commonly known as a network. **Instead
of turning off a lobby server that nobody is using, you'd stop the proxy instance, kicking
all players from all servers in the process.**

### Do I need this plugin?

You only need this if you are unable to switch to the appropriate BungeeCord egg. You may
also use this if you find it more convenient to have a stop command available on your
BungeeCord instance, it won't cause any harm to install it even if you don't need it.

## Features

- **It's very lightweight:** only 4 KB in size, RAM usage is only increased by less than
1 MB.
- **It's completely open source:** you can modify it to your liking, although we doubt
anyone will modify it.
- **It does not override the original `/stop` functionality in Bukkit/Spigot servers.**

## How to install

1. Shut down your BungeeCord instance: first click on the Stop button on your Pterodactyl
panel and then type `end` in console. Alternatively, you could click on Stop and then
Kill, but the first method ensures that your instance turns off gracefully, avoiding any
data loss.
2. Upload `PteroBungee-v1.2.0.jar` to the "plugins" folder of your server
3. Start the BungeeCord instance back up.

And that's it!

## Download

- Download from [GitHub](https://github.com/sparkedhost/PteroBungee/releases).
