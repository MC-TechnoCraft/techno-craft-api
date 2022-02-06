package org.techno.api.object;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.techno.api.exception.InformationIsHiddenException;
import org.techno.api.mode.ServerMode;
import org.techno.api.mode.bedwars.BedWarsProfileHolder;
import org.techno.api.mode.skyblock.SkyBlockProfileHolder;

import java.util.UUID;

public interface TechnoPlayer extends SkyBlockProfileHolder, BedWarsProfileHolder {

    @NotNull
    UUID getUniqueId();

    @NotNull
    String getUsername();

    @NotNull
    String getGroupName() throws InformationIsHiddenException;

    @Nullable
    ServerMode getCurrentMode() throws InformationIsHiddenException;

}
