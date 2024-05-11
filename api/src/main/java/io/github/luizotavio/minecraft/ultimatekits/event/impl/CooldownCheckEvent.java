package io.github.luizotavio.minecraft.ultimatekits.event.impl;

import io.github.luizotavio.minecraft.ultimatekits.event.UltimateKitEvent;
import io.github.luizotavio.minecraft.ultimatekits.model.Kit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

/**
 * Called on checking for cooldown of a kit when a player
 * tries to equip it.
 *
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
@AllArgsConstructor
@Getter
@Setter
public class CooldownCheckEvent extends UltimateKitEvent {

  private final Player player;

  private final Kit kit;

  private boolean hasCooldown;

}
