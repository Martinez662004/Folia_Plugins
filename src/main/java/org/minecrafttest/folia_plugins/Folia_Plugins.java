package org.minecrafttest.folia_plugins;

import org.bukkit.plugin.java.JavaPlugin;
import org.minecrafttest.command.Plugin_Command;
import org.minecrafttest.listenner.Plugin_Listenner;
import org.minecrafttest.model.Scheduler;
import org.minecrafttest.Task.task_1;
import org.minecrafttest.Task.task_2;

public final class Folia_Plugins extends JavaPlugin {

    private Scheduler.Task task1;
    private Scheduler.Task task2;
    //private Scheduler.Task task3;
    //...

    @Override
    public void onEnable() {
        System.out.println("Enable");

        //Listenners
        getServer().getPluginManager().registerEvents(new Plugin_Listenner(), this);

        //Commands
        getCommand("your_Command").setExecutor(new Plugin_Command());

        //Task
        task1 = Scheduler.runTimer(task_1.getInstance(), 0, 1);
        if (!Scheduler.isFolia())
            task2 = Scheduler.runTimer(task_2.getInstance(), 0, 20 /* updates 1 per second */);
    }

    @Override
    public void onDisable() {
        //Close Task
        if (task1 != null) task1.cancel();
        if (task2 != null) task2.cancel();

        System.out.println("God Bye");
    }

    public static Folia_Plugins getInstance() {
        return getPlugin(Folia_Plugins.class);
    }
}
