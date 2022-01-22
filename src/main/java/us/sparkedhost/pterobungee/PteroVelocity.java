package us.sparkedhost.pterobungee;

import com.google.inject.Inject;
import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;
import us.sparkedhost.pterobungee.Commands.VelocityStopCommand;

@Plugin(id = "pterobungee", name = "PteroBungee", version = "1.2.1-Velocity", url = "https://github.com/SparkedHost/PteroBungee", authors = "BetTD")
public class PteroVelocity {
    public static PteroVelocity instance;
    public final ProxyServer server;
    private final Logger logger;

    @Inject
    public PteroVelocity(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
        instance = this;

        logger.info("PteroBungee (for Velocity) is now loading.");
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent e) {
        CommandManager cmdManager = server.getCommandManager();
        cmdManager.register(cmdManager.metaBuilder("stop").build(), new VelocityStopCommand());
    }
}
