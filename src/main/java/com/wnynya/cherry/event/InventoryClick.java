package com.wnynya.cherry.event;

import com.wnynya.cherry.gui.CherryMenuEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {

  @EventHandler
  public void onInventoryClickEvent(InventoryClickEvent event) {
    CherryMenuEvent.inventoryClick(event);
  }

}
