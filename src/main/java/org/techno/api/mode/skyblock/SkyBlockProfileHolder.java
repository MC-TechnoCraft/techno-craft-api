package org.techno.api.mode.skyblock;

import org.jetbrains.annotations.NotNull;
import org.techno.api.exception.InformationIsHiddenException;

public interface SkyBlockProfileHolder {

  @NotNull
  SkyBlockProfile skyBlockProfile() throws InformationIsHiddenException;

}
