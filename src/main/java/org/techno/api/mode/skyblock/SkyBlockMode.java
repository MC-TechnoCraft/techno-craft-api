package org.techno.api.mode.skyblock;

import org.jetbrains.annotations.NotNull;
import org.techno.api.mode.ServerMode;

public interface SkyBlockMode extends ServerMode {

  @NotNull SkyBlockMode.LocationType currentLocation();

  enum LocationType {
    ISLAND, LOBBY
  }

}
