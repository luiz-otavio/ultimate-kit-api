package io.github.luizotavio.minecraft.ultimatekits;

import io.github.luizotavio.minecraft.ultimatekits.registry.KitRegistry;
import io.github.luizotavio.minecraft.ultimatekits.service.CooldownService;
import org.jetbrains.annotations.NotNull;

/**
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface KitAPI {

  @NotNull KitRegistry getRegistry();

  @NotNull CooldownService getCooldownService();

}
