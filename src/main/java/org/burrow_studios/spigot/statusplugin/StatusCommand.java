package org.burrow_studios.spigot.statusplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.util.UUID;

public class StatusCommand implements CommandExecutor {
    private final YamlConfiguration config;
    private final String defaultStatus;

    public StatusCommand(YamlConfiguration config, String defaultStatus) {
        this.config = config;
        this.defaultStatus = defaultStatus;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // TODO: add option for OPs to change the status of another player (/status <player> <status>)

            // will be needed later
            String status = config.getString(player.getUniqueId().toString());


            // TODO: Check if player argument is valid with statusList.
            String newStatus = args[0];

            setStatus(player.getUniqueId(), newStatus);
        }

        return true;
    }

    private void setStatus(UUID player, String newStatus) {
        // TODO: update status
    }
}
