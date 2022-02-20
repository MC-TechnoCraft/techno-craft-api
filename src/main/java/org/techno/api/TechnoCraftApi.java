package org.techno.api;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.techno.api.exception.InformationIsHiddenException;
import org.techno.api.mode.ServerMode;
import org.techno.api.object.TechnoPlayer;

public interface TechnoCraftApi {

  static TechnoCraftApi create(@NotNull String apiKey) {
    return new TechnoCraftApiImpl(apiKey);
  }

  @Nullable TechnoPlayer player(UUID uniqueId) throws InformationIsHiddenException;

  @Nullable TechnoPlayer playerByName(String username) throws InformationIsHiddenException;

  @Nullable ServerMode serverMode(String rawName);

  @NotNull String callerApiKey();

}
