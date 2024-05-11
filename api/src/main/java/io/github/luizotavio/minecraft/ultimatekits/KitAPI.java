package io.github.luizotavio.minecraft.ultimatekits;

import io.github.luizotavio.minecraft.ultimatekits.registry.KitRegistry;
import io.github.luizotavio.minecraft.ultimatekits.service.CooldownService;
import org.jetbrains.annotations.NotNull;

/**
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface KitAPI {

  /**
   * Get the registry of kits from the plugin
   * It's all the time mutable after reload
   * @return the registry of kits
   */
  @NotNull KitRegistry getRegistry();

  /**
   * Get the cooldown service from the plugin
   * @return the cooldown service
   */
  @NotNull CooldownService getCooldownService();

}
