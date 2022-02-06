package org.techno.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.techno.api.exception.InformationIsHiddenException;
import org.techno.api.mode.ServerMode;
import org.techno.api.object.TechnoPlayer;

import java.util.UUID;

final class TechnoCraftApiImpl implements TechnoCraftApi {

    private final String callerApiKey;

    TechnoCraftApiImpl(final @NotNull String callerApiKey) {
        this.callerApiKey = callerApiKey;
    }

    @Override
    public @Nullable TechnoPlayer getPlayer(UUID uniqueId) throws InformationIsHiddenException {
        return null;
    }

    @Override
    public @Nullable TechnoPlayer getPlayerByName(String username) throws InformationIsHiddenException {
        return null;
    }

    @Override
    public @Nullable ServerMode getServerMode(String rawName) {
        return null;
    }

    @Override
    public @NotNull String getCallerApiKey() {
        return callerApiKey;
    }
}
