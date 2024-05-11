package io.github.luizotavio.minecraft.ultimatekits.strategy;

import io.github.luizotavio.minecraft.ultimatekits.registry.KitRegistry;

/**
 * Standard interface for loading and saving kits.
 * The implementations must be passed to {@link KitRegistry#setLoaderStrategy} if needed to be used.
 *
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface KitLoaderStrategy {

  /**
   * Used to load all kits with a given logic.
   * By default, the implementation of that strategy loads it from the kits folder.
   */
  void load();

  /**
   * Used to save all kits with a given logic.
   * By default, the implementation of that strategy saves it to the kits folder.
   */
  void save();

}
