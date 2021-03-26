package angelcometfish.com.github.shulkerback;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.ShulkerBox;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShulkerBack extends JavaPlugin implements Listener {


    @EventHandler
    public void interrupt(PlayerInteractEvent e){
        Player player = e.getPlayer();
        ItemStack Shulkerhand = player.getInventory().getItemInMainHand();
        Location loc = player.getLocation();

        if (Shulkerhand.getType().name().endsWith("SHULKER_BOX")) {
            if(e.getAction()== Action.RIGHT_CLICK_AIR)
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);

                }
            }
        } else {
            player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを手に持ってからお試しください"));
        }
    }

    @Override
    public void onEnable() {
        System.out.println("シュルカープラグインが読み込まれました");
        Bukkit.getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onClick(InventoryClickEvent e){
        ItemStack slot = e.getCurrentItem();
        Player player = (Player) e.getView().getPlayer();
        Location loc = player.getLocation();
        if(slot==null) return;
        if(e.getView().getTitle().equals("ShulkerBox")){
            if(slot.getType().name().endsWith("SHULKER_BOX")){
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスは選択できません"));
                player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
            }
        }

    }

    @EventHandler
        public void onClose(InventoryCloseEvent e){
            Inventory backpack = e.getInventory();
            Player player = (Player) e.getPlayer();
            if (e.getView().getTitle().equals("ShulkerBox")) {
                ItemStack Shulkerhand = player.getInventory().getItemInMainHand();
                if (Shulkerhand.getType() == Material.SHULKER_BOX) {
                    if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                        BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                        if (im.getBlockState() instanceof ShulkerBox) {
                            Location ploc = player.getLocation().clone();
                            ploc.setY(0);
                            Block yblock = ploc.getBlock();
                            yblock.setType(Material.SHULKER_BOX);
                            ShulkerBox fakeshulker = (ShulkerBox)yblock.getState();
                            Inventory newInv = fakeshulker.getInventory();
                            newInv.setContents(backpack.getContents());
                            im.setBlockState(yblock.getState());
                            Shulkerhand.setItemMeta(im);
                            yblock.setType(Material.BEDROCK);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを閉じます"));
                        }
                    }

                }else if(Shulkerhand.getType().name().endsWith("SHULKER_BOX")){
                    if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                        BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                        if (im.getBlockState() instanceof ShulkerBox) {
                            Location ploc = player.getLocation().clone();
                            ploc.setY(0);
                            Block yblock = ploc.getBlock();
                            yblock.setType(Material.SHULKER_BOX);
                            ShulkerBox fakeshulker = (ShulkerBox)yblock.getState();
                            Inventory newInv = fakeshulker.getInventory();
                            newInv.setContents(backpack.getContents());
                            im.setBlockState(yblock.getState());
                            Shulkerhand.setItemMeta(im);
                            yblock.setType(Material.BEDROCK);
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを閉じます"));
                        }
                    }
                }
                    }
                }
            }
