package io.github.luizotavio.minecraft.ultimatekits.event;

import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public class UltimateKitEvent extends Event implements Cancellable {

  private static final HandlerList HANDLER_LIST = new HandlerList();

  @NotNull
  public static HandlerList getHandlerList() {
    return HANDLER_LIST;
  }

  private boolean cancelled;

  @Override
  public boolean isCancelled() {
    return cancelled;
  }

  @Override
  public void setCancelled(boolean b) {
    this.cancelled = b;
  }

  @Override
  public @NotNull HandlerList getHandlers() {
    return HANDLER_LIST;
  }

  public <T extends Event> T call() {
    Bukkit.getPluginManager().callEvent(this);
    return (T) this;
  }
}
