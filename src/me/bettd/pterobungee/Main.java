package me.bettd.pterobungee;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.command.ConsoleCommandSender;
import java.util.logging.Level;
public class Main extends Plugin {
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new StopCmd());
        getLogger().log(Level.INFO, "PteroBungee loaded. v" + getProxy().getPluginManager().getPlugin("PteroBungee").getDescription().getVersion() + " developed by BetTD");
        Runnable doneOutput = new Runnable() {
            public void run() {
                sendStartedMsg();
            }
        };
        new Thread(doneOutput).start();
    }
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "PteroBungee disabled. Have a great day.");
    }
    public void sendStartedMsg() {
        ConsoleCommandSender console = (ConsoleCommandSender) getProxy().getConsole();
        console.sendMessage(new TextComponent("Done (2,100s)! For help, type \"help\" or \"?\""));
    }
}
