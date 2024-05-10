package io.github.luizotavio.minecraft.ultimatekits.strategy;

import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.UUID;

/**
 * @author Luiz O. F. Corrêa
 * @since 09/05/2024
 **/
public interface CooldownPersistentStrategy {

  void save(@NotNull UUID uniqueId, Map<String, Long> kitToCooldown);

  Map<String, Long> load(@NotNull UUID uniqueId);

}
