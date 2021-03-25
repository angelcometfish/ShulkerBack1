package angelcometfish.com.github.shulkerback;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.ShulkerBox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShulkerBack extends JavaPlugin implements Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        ItemStack Shulkerhand = ((Player) sender).getInventory().getItemInMainHand();
        if(Shulkerhand.getType()==Material.SHULKER_BOX){
            if(Shulkerhand.getItemMeta() instanceof BlockStateMeta){
                BlockStateMeta im = (BlockStateMeta)Shulkerhand.getItemMeta();
                if(im.getBlockState() instanceof ShulkerBox){
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "Shulker Box");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        }else{
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&2シュルカーボックスを手に持ってからお試しください"));
        }
        return false;
    }

    @Override
    public void onEnable() {
        System.out.println("Guiプラグインが読み込まれました");
        Bukkit.getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
