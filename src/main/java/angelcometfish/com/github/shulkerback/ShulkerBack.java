package angelcometfish.com.github.shulkerback;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.ShulkerBox;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShulkerBack extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getLogger().info(getName() + " が起動しました");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(getName() + " が終了しました");
    }

    @EventHandler
    public void openShulkerInventory(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack handItem = player.getInventory().getItemInMainHand();
        Location loc = player.getLocation();

        if (!handItem.getType().name().endsWith("SHULKER_BOX")) {
            return;
        }
        if (e.getAction() != Action.RIGHT_CLICK_AIR) {
            return;
        }

        Inventory shulkerInventory = getShulkerInventory(handItem);
        if (shulkerInventory == null) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cシュルカーボックスを開けませんでした"));
            return;
        }

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを開きます"));
        player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 2, 1);
        player.openInventory(shulkerInventory);
    }

    @EventHandler
    public void disableShulkerBoxInput(InventoryClickEvent e) {
        ItemStack slot = e.getCurrentItem();
        Player player = (Player) e.getView().getPlayer();
        Location loc = player.getLocation();
        if (e.getView().getTitle().equals("ShulkerBox")) {
            if (slot != null && slot.getType().name().endsWith("SHULKER_BOX")) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスは選択できません"));
                player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
            } else if (e.getAction() == InventoryAction.HOTBAR_SWAP) {
                ItemStack hotBarItem = player.getInventory().getItem(e.getHotbarButton());
                if (hotBarItem != null && hotBarItem.getType().name().endsWith("SHULKER_BOX")) {
                    e.setCancelled(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスは選択できません"));
                    player.playSound(loc, Sound.ENTITY_VILLAGER_NO, 2, 1);
                }
            }
        }
    }

    @EventHandler
    public void saveShulkerBoxInventoryOnClose(InventoryCloseEvent e) {
        Inventory inv = e.getInventory();
        Player player = (Player) e.getPlayer();
        if (!e.getView().getTitle().equals("ShulkerBox")) {
            return;
        }
        ItemStack handItem = player.getInventory().getItemInMainHand();
        boolean success = saveShulkerInventory(handItem, inv);
        if (success) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2シュルカーボックスを閉じます"));
        } else {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cアイテムは正常に保存されませんでした"));
            // TODO e.getInventory() の内容をファイル等に保存して、後から運営が見れるようにすることで、補填をスムーズに行えるようにする
        }
    }

    /**
     * アイテムからシュルカーボックスのインベントリを取得する
     *
     * @param item インベントリを取得したいシュルカーボックス
     * @return 取得したインベントリ。何らかの理由で失敗した場合は null を返す
     * @throws IllegalArgumentException アイテムがシュルカーボックスではない場合
     */
    private Inventory getShulkerInventory(ItemStack item) {
        if (item == null || !item.getType().name().endsWith("SHULKER_BOX")) {
            throw new IllegalArgumentException();
        }

        if (item.getItemMeta() == null || !(item.getItemMeta() instanceof BlockStateMeta)) {
            return null;
        }

        BlockStateMeta shulkerBlockState = (BlockStateMeta) item.getItemMeta();
        if (!(shulkerBlockState.getBlockState() instanceof ShulkerBox)) {
            return null;
        }

        ShulkerBox shulker = (ShulkerBox) shulkerBlockState.getBlockState();
        Inventory inv = Bukkit.createInventory(null, 27, "ShulkerBox");
        inv.setContents(shulker.getInventory().getContents());

        return inv;
    }

    /**
     * シュルカーのインベントリを保存する
     *
     * @param item 保存先のシュルカーアイテム
     * @param inv  保存元のインベントリ
     * @return 成功した場合 true、失敗した場合 false
     * @throws IllegalArgumentException アイテムがシュルカーではない場合
     */
    private boolean saveShulkerInventory(ItemStack item, Inventory inv) {
        if (item == null || !item.getType().name().endsWith("SHULKER_BOX")) {
            throw new IllegalArgumentException();
        }

        if (item.getItemMeta() == null || !(item.getItemMeta() instanceof BlockStateMeta)) {
            return false;
        }

        BlockStateMeta shulkerItemMeta = (BlockStateMeta) item.getItemMeta();
        if (!(shulkerItemMeta.getBlockState() instanceof ShulkerBox)) {
            return false;
        }

        ShulkerBox shulkerBlockState = (ShulkerBox) shulkerItemMeta.getBlockState();
        shulkerBlockState.getInventory().setContents(inv.getContents());
        shulkerItemMeta.setBlockState(shulkerBlockState);
        item.setItemMeta(shulkerItemMeta);
        return true;
    }
}