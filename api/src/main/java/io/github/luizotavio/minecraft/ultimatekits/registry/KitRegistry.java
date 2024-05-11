package io.github.luizotavio.minecraft.ultimatekits.registry;

import io.github.luizotavio.minecraft.ultimatekits.model.Kit;
import io.github.luizotavio.minecraft.ultimatekits.strategy.KitLoaderStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Standard registry of kits based on the kit name
 * It's responsible for managing the kits of the plugin and the loader strategy
 * This registry is mutable, and you can register/unregister kits
 *
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface KitRegistry {

  /**
   * Get the loader strategy of the kits
   * @return the loader strategy of the kits
   */
  @NotNull
  KitLoaderStrategy getLoaderStrategy();

  /**
   * Set the loader strategy of the kits
   * @param loaderStrategy the loader strategy of the kits
   */
  void setLoaderStrategy(@NotNull KitLoaderStrategy loaderStrategy);

  /**
   * Get the immutable map of the registered kits
   * @return the immutable map of the registered kits
   */
  Map<String, Kit> getKits();

  /**
   * Register a kit
   * @param kit the kit to register
   */
  void register(@NotNull Kit kit);

  /**
   * Unregister a kit
   * @param kit the kit to unregister
   */
  void unregister(@NotNull Kit kit);

  /**
   * Get a kit by name
   * @param name the name of the kit
   * @return the kit or null if the kit is not registered
   */
  @Nullable
  Kit getKit(@NotNull String name);

  /**
   * Get the immutable collection of kits
   * @return the immutable collection of kits
   */
  List<Kit> getCollection();


}
