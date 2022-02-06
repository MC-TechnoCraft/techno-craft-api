package org.techno.api.mode.bedwars;

import org.jetbrains.annotations.NotNull;
import org.techno.api.mode.ServerMode;

public interface BedWarsMode extends ServerMode {

    @NotNull BedWarsMode.LocationType getCurrentLocation();

    enum LocationType {
        LOBBY, WAITING, ARENA
    }

}
