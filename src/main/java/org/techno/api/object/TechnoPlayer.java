package org.techno.api.object;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.techno.api.exception.InformationIsHiddenException;
import org.techno.api.mode.ServerMode;
import org.techno.api.mode.bedwars.BedWarsProfileHolder;
import org.techno.api.mode.skyblock.SkyBlockProfileHolder;

public interface TechnoPlayer extends SkyBlockProfileHolder, BedWarsProfileHolder {

  @NotNull
  UUID uniqueId();

  @NotNull
  String username();

  @NotNull
  String groupName() throws InformationIsHiddenException;

  boolean currentlyOnline() throws InformationIsHiddenException;

  @Nullable
  String groupDisplayColor() throws InformationIsHiddenException;

  @Nullable
  ServerMode currentMode() throws InformationIsHiddenException;

  @Nullable
  Discord discord() throws InformationIsHiddenException;

  default boolean discordLinked() throws InformationIsHiddenException {
    return discord() != null;
  }

}
