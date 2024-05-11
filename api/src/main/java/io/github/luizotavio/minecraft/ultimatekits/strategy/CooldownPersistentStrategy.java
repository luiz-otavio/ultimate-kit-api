package io.github.luizotavio.minecraft.ultimatekits.strategy;

import io.github.luizotavio.minecraft.ultimatekits.service.CooldownService;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.UUID;

/**
 * Standard strategy to save and load cooldowns from a player
 * If needed, you can change the strategy to save/load the cooldowns in {@link CooldownService#setStrategy}
 *
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface CooldownPersistentStrategy {

  /**
   * Save the cooldowns of a player
   * Usually called on disabling the plugin
   * @param uniqueId the unique id of the player
   * @param kitToCooldown the map of kit to cooldown
   */
  void save(@NotNull UUID uniqueId, Map<String, Long> kitToCooldown);

  /**
   * Load the cooldowns of a player
   * Usually called on starting the plugin
   * @param uniqueId the unique id of the player
   * @return the map of kit to cooldown
   */
  Map<String, Long> load(@NotNull UUID uniqueId);

}
