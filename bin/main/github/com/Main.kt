package github.com

import github.com.commands.DiscordCommand
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        getCommand("discord")?.setExecutor(DiscordCommand());

        logger.info("[yDiscord] Plugin successfully enabled!")
        Bukkit.getConsoleSender().sendMessage("§7[§ayDiscord§7] §fPlugin has been §aenabled§f.")
    }

    override fun onDisable() {
        logger.info("[yDiscord] Plugin disabled.")
        Bukkit.getConsoleSender().sendMessage("§7[§cyDiscord§7] §fPlugin has been §cdisabled§f.")
    }
}