package org.techno.api.mode;

import org.jetbrains.annotations.NotNull;

public interface ServerMode {

    @NotNull
    String getName();

    @NotNull
    String getDescription();

    int getCurrentOnline();

}
