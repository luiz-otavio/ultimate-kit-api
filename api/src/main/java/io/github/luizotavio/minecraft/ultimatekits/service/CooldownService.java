package io.github.luizotavio.minecraft.ultimatekits.service;

import com.google.common.collect.Table;
import io.github.luizotavio.minecraft.ultimatekits.strategy.CooldownPersistentStrategy;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface CooldownService {

  @NotNull CooldownPersistentStrategy getStrategy();

  void setStrategy(@NotNull CooldownPersistentStrategy strategy);

  /**
   * Get the immutable table of cooldowns by player and kit
   * The table consists of:
   * - Row: Player UUID
   * - Column: Kit name
   * - Value: Cooldown time in milliseconds after System.currentTimeMillis()
   * @return Immutable table of cooldowns
   */
  @NotNull
  Table<UUID, String, Long> getCooldowns();

  /**
   * Get the cooldown time of a player for a kit
   * @param player Player UUID
   * @param kit Kit name
   * @return Cooldown time in milliseconds after System.currentTimeMillis() or -1 if the player has no cooldown for the kit
   */
  long getCooldown(@NotNull UUID player, @NotNull String kit);

  /**
   * Set the cooldown time of a player for a kit
   * @param player Player UUID
   * @param kit Kit name
   * @param time Cooldown time in milliseconds after System.currentTimeMillis()
   */
  void setCooldown(@NotNull UUID player, @NotNull String kit, long time);

  /**
   * Remove the cooldown of a player for a kit
   * @param player Player UUID
   * @param kit Kit name
   */
  void removeCooldown(@NotNull UUID player, @NotNull String kit);

  boolean hasCooldown(@NotNull UUID player, @NotNull String kit);
}
