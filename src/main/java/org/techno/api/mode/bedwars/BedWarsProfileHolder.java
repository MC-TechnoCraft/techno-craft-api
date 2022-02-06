package org.techno.api.mode.bedwars;

import org.jetbrains.annotations.NotNull;
import org.techno.api.exception.InformationIsHiddenException;

public interface BedWarsProfileHolder {

    @NotNull BedWarsProfile getBedWarsProfile() throws InformationIsHiddenException;

}
