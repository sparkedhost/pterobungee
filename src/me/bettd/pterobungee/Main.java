package me.bettd.pterobungee;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.command.ConsoleCommandSender;
import java.util.logging.Level;
public class Main extends Plugin {
    int i = (int) System.currentTimeMillis();
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new StopCmd());
        getProxy().getPluginManager().registerListener(this, new Event());
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
        int result = (int) System.currentTimeMillis() - i;
        ConsoleCommandSender console = (ConsoleCommandSender) getProxy().getConsole();
        console.sendMessage(new TextComponent("Done (" + result + "ms)! For help, type \"help\" or \"?\""));
    }
}
