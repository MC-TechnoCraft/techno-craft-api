package org.techno.api;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.techno.api.exception.InformationIsHiddenException;
import org.techno.api.mode.ServerMode;
import org.techno.api.object.TechnoPlayer;

final class TechnoCraftApiImpl implements TechnoCraftApi {

  private final String callerApiKey;

  TechnoCraftApiImpl(final @NotNull String callerApiKey) {
    this.callerApiKey = callerApiKey;
  }

  @Override
  public @Nullable TechnoPlayer player(UUID uniqueId) throws InformationIsHiddenException {
    return null;
  }

  @Override
  public @Nullable TechnoPlayer playerByName(String username)
      throws InformationIsHiddenException {
    return null;
  }

  @Override
  public @Nullable ServerMode serverMode(String rawName) {
    return null;
  }

  @Override
  public @NotNull String callerApiKey() {
    return callerApiKey;
  }
}
