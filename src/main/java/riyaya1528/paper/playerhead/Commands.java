package riyaya1528.paper.playerhead;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (sender instanceof Player) {
            if(command.getName().equals("head")) {
                if(args.length != 0) {
                    ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
                    SkullMeta meta = (SkullMeta) skull.getItemMeta();
                    meta.setOwner(args[0]);
                    skull.setItemMeta(meta);

                    ((Player) sender).getInventory().addItem(skull);
                    sender.sendMessage("§a§l" + sender.getName() + "に" + args[0] + "の頭を与えました");
                }else {
                    sender.sendMessage("§c§lプレイヤー名を引数に入力してください");
                    sender.sendMessage("§c§l例 : /head [mcid]");
                }
            }
        }
        return true;
    }
}
