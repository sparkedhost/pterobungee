package com.sparkedhost.pterobungee.Commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class BungeeStopCommand extends Command {
    public BungeeStopCommand() {
        super("stop");
    }
    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer)) {
            ProxyServer.getInstance().stop();
            return;
        }

        ((ProxiedPlayer) sender).chat("/minecraft:stop");
    }
}
