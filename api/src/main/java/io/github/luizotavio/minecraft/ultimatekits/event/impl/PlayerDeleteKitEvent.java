package io.github.luizotavio.minecraft.ultimatekits.event.impl;

import io.github.luizotavio.minecraft.ultimatekits.event.UltimateKitEvent;
import io.github.luizotavio.minecraft.ultimatekits.model.Kit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

/**
 * Called when an admin tries to delete a kit.
 *
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
@AllArgsConstructor
@Getter
@Setter
public class PlayerDeleteKitEvent extends UltimateKitEvent {

  private final Player player;

  private Kit kit;

}
