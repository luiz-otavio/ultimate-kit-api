package io.github.luizotavio.minecraft.ultimatekits.event.impl;

import io.github.luizotavio.minecraft.ultimatekits.event.UltimateKitEvent;
import io.github.luizotavio.minecraft.ultimatekits.model.Kit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

/**
 * Called when an admin gives a kit to a player or himself.
 *
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
@AllArgsConstructor
@Getter
@Setter
public class PlayerGiveKitEvent extends UltimateKitEvent {

  private final Player player;
  private final Player to;

  private Kit kit;

}
