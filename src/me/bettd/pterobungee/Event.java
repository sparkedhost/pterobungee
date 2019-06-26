package me.bettd.pterobungee;
import io.netty.channel.ChannelFuture;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.command.ConsoleCommandSender;
import net.md_5.bungee.event.EventHandler;
public class Event implements Listener {
    @EventHandler
    public void operationComplete(ChannelFuture future) {
        if (future.isSuccess())
        {
            ConsoleCommandSender console = (ConsoleCommandSender) ProxyServer.getInstance().getConsole();
            console.sendMessage(new TextComponent("Done (" + System.currentTimeMillis() + ")! For help, type \"help\" or \"?\""));
        }
    }
}
