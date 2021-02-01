package us.sparkedhost.pterobungee;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;
import us.sparkedhost.pterobungee.Commands.StopCommand;

import java.util.logging.Level;

public final class PteroBungee extends Plugin {

    int i = (int) System.currentTimeMillis();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getProxy().getPluginManager().registerCommand(this, new StopCommand());
        getLogger().log(Level.INFO, "PteroBungee loaded. v" + getProxy().getPluginManager().getPlugin("PteroBungee").getDescription().getVersion() + " developed by SparkedHost");
        Runnable doneOutput = new Runnable() {
            public void run() {
                sendStartedMsg();
            }
        };
        new Thread(doneOutput).start();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "PteroBungee disabled. Have a great day.");
    }

    public void sendStartedMsg() {
        int result = (int) System.currentTimeMillis() - i;
        ProxyServer.getInstance().getConsole().sendMessage(new TextComponent("Done (PteroBungee)! For help, type \"help\" or \"?\""));
    }

}
