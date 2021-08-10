package us.sparkedhost.pterobungee;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;
import us.sparkedhost.pterobungee.Commands.StopCommand;

import java.util.logging.Level;

public final class PteroBungee extends Plugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getProxy().getPluginManager().registerCommand(this, new StopCommand());
        getLogger().log(Level.INFO, "PteroBungee loaded. v" + this.getDescription().getVersion() + " developed by" + this.getDescription().getAuthor());
        Runnable doneOutput = this::sendStartedMsg;
        getProxy().getScheduler().runAsync(this, doneOutput);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "PteroBungee disabled. Have a great day.");
    }

    public void sendStartedMsg() {
        ProxyServer.getInstance().getConsole().sendMessage(new TextComponent("Done (PteroBungee)! For help, type \"help\" or \"?\""));
    }
}
