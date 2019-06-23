package me.bettd.pterobungee;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
public class StopCmd extends Command {
    public StopCmd() {
        super("stop");
    }
    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer)) ProxyServer.getInstance().stop(); else  ((ProxiedPlayer) sender).chat("/minecraft:stop");
    }
}
