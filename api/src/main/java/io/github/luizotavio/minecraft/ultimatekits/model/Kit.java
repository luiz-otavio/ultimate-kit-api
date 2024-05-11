package io.github.luizotavio.minecraft.ultimatekits.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

/**
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface Kit {

  @NotNull
  String getName();

  /**
   * Get the icons of the kit
   * @return
   */
  @NotNull Map<ItemStatus, ItemStack> getIcons();

  /**
   * Get the options of the kit
   * @return Map of options
   */
  @NotNull Map<Option, Object> getOptions();

  /**
   * Immutable indexed collection for the items given by the kit
   * The index is the slot of the item in the inventory
   * @return List of ItemStack
   */
  @NotNull List<ItemStack> getContent();

  /**
   * Give the kit to the player
   * @param player Player to give the kit
   */
  void equip(@NotNull Player player);

  /**
   * Check if the kit is available for the player
   * @param player Player to check
   * @return true if the player can use the kit
   */
  boolean isAvailable(@NotNull Player player);

  /**
   * Set the icon of the kit
   * @param status Status of the icon
   * @param item ItemStack to set
   */
  void setIcon(@NotNull ItemStatus status, @NotNull ItemStack item);

  /**
   * Set the option of the kit
   * @param option Option to set
   * @param value Value of the option
   */
  void setOption(@NotNull Option option, @NotNull Object value);

  /**
   * Set the item in the index
   * @param item ItemStack or null to remove the item
   * @param index Index of the item in the inventory
   * @throws IllegalArgumentException if the index is out of bounds = >= 54
   */
  void setItem(@NotNull ItemStack item, int index);

  /**
   * Add the item to the kit
   * @param item ItemStack to add
   */
  void addItem(@NotNull ItemStack item);

  /**
   * Remove the item from the kit
   * @param item ItemStack to remove
   */
  void removeItem(@NotNull ItemStack item);

  /**
   * Get the option of the kit
   * @param clazz Class of the option
   * @param option Option to get
   * @return Value of the option
   * @param <T> Type of the option
   */
  <T> T getOption(Class<T> clazz, @NotNull Option option);

  /**
   * Get the option of the kit
   * @param option Option to get
   * @return Value of the option
   * @param <T> Type of the option
   */
  <T> T getOption(@NotNull Option option);

  /**
   * Get the icon of the kit based on the status
   * @param status Status of the icon
   * @return ItemStack of the icon
   */
  @NotNull
  ItemStack getIcon(@NotNull ItemStatus status);

  enum ItemStatus {
    AVAILABLE,
    ON_COOLDOWN,
    NO_PERMISSION;
  }

  @AllArgsConstructor
  @Getter
  enum Option {
    GUI_SLOT(Integer.class),
    ONE_TIME_COST(Double.class),
    COOLDOWN(Integer.class),
    PERMISSION(String.class),
    SOUND(Sound.class),
    PARTICLE(String.class),
    REEDEM_MESSAGE(String.class),
    BROADCASTS_MESSAGES(List.class);

    private final Class<?> type;

    public <T> T fromValue(@NotNull Object value) {
      Class<?> clazz = value.getClass();
      if (!clazz.isAssignableFrom(type)) {
        throw new IllegalArgumentException("Invalid type for option " + this.name());
      }

      return (T) value;
    }
  }

}
