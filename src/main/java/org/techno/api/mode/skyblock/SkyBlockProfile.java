package org.techno.api.mode.skyblock;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.techno.api.common.NamespaceKey;

import java.util.Set;

public interface SkyBlockProfile {

    @NotNull
    SkyBlockInventory getInventory();

    interface SkyBlockObject {}

    interface SkyBlockInventory extends SkyBlockObject {

        @NotNull
        @Unmodifiable
        Set<SkyBlockItem> getStorageItem();

        @Nullable
        SkyBlockItem getOffHandItem();

    }

    interface SkyBlockItem extends SkyBlockObject {

        short getMaterialId();

        @NotNull
        NamespaceKey getItemNamespaceKey();

    }

}
