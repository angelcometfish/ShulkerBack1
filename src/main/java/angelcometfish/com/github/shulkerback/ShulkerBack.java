package angelcometfish.com.github.shulkerback;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.ShulkerBox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShulkerBack extends JavaPlugin implements Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        ItemStack Shulkerhand = ((Player) sender).getInventory().getItemInMainHand();
        if (Shulkerhand.getType() == Material.SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);

                }
            }
        } else if (Shulkerhand.getType() == Material.WHITE_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.ORANGE_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.MAGENTA_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.LIGHT_BLUE_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.YELLOW_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.LIME_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.PINK_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.GRAY_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.LIGHT_GRAY_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.CYAN_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.PURPLE_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.BLUE_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.BROWN_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.GREEN_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.RED_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else if (Shulkerhand.getType() == Material.BLACK_SHULKER_BOX) {
            if (Shulkerhand.getItemMeta() instanceof BlockStateMeta) {
                BlockStateMeta im = (BlockStateMeta) Shulkerhand.getItemMeta();
                if (im.getBlockState() instanceof ShulkerBox) {
                    ShulkerBox shulker = (ShulkerBox) im.getBlockState();
                    Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
                    inv.setContents(shulker.getInventory().getContents());
                    player.openInventory(inv);
                }
            }
        } else {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを手に持ってからお試しください"));
        }
        return false;
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
        if(slot==null) return;
        if(e.getView().getTitle().equals("ShulkerBox")){
            if(slot.getType()==Material.SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.WHITE_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.ORANGE_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.MAGENTA_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.LIGHT_BLUE_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.YELLOW_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.LIME_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.PINK_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.GRAY_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.LIGHT_GRAY_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.CYAN_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.PURPLE_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.BLUE_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.BROWN_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.GREEN_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.RED_SHULKER_BOX){
                e.setCancelled(true);
            }else if(slot.getType()==Material.BLACK_SHULKER_BOX){
                e.setCancelled(true);
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

                }
            }
        }

        }
