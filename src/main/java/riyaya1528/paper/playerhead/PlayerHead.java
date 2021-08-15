package riyaya1528.paper.playerhead;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerHead extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("head").setExecutor(new Commands());

        System.out.println("[PlayerHead]プラグインが有効になりました");
    }

    @Override
    public void onDisable() {
        System.out.println("[PlayerHead]プラグインが無効になりました");
    }
}
