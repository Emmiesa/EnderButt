package me.lisariesey.enderbutt;

import lombok.Getter;
import me.lisariesey.enderbutt.listener.EnderButtListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderButt extends JavaPlugin {

    @Getter public static EnderButt instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("console-startup-message")));
        getServer().getPluginManager().registerEvents(new EnderButtListener(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("console-shutdown-message")));
    }
}
