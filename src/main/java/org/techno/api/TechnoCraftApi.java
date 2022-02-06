package org.techno.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.techno.api.exception.InformationIsHiddenException;
import org.techno.api.mode.ServerMode;
import org.techno.api.object.TechnoPlayer;

import java.util.UUID;

public interface TechnoCraftApi {

    static TechnoCraftApi create(@NotNull String apiKey) {
        return new TechnoCraftApiImpl(apiKey);
    }

    @Nullable TechnoPlayer getPlayer(UUID uniqueId) throws InformationIsHiddenException;

    @Nullable TechnoPlayer getPlayerByName(String username) throws InformationIsHiddenException;

    @Nullable ServerMode getServerMode(String rawName);

    @NotNull String getCallerApiKey();

}
