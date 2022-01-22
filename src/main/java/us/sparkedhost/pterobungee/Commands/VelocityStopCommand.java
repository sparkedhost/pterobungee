package us.sparkedhost.pterobungee.Commands;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.proxy.Player;
import us.sparkedhost.pterobungee.PteroVelocity;

public class VelocityStopCommand implements SimpleCommand {
    @Override
    public void execute(final Invocation invocation) {
        CommandSource source = invocation.source();

        if (!(source instanceof Player)) {
            PteroVelocity.instance.server.shutdown();
            return;
        }

        ((Player) source).spoofChatInput("/minecraft:stop");
    }
}
