package github.com.commands

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class DiscordCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String?>): Boolean {
        val onlyPlayers = "This command can only be used by players.";

        sender.sendMessage("oii")

        if (sender is Player) {
            sender.sendMessage("${ChatColor.AQUA}Join our Discord: ${ChatColor.YELLOW}https://discord.gg/url");
        } else {
            sender.sendMessage("${ChatColor.RED}$onlyPlayers");
        }

        return true;
    }
}