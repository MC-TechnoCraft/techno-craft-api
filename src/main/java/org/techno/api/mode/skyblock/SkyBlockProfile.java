package org.techno.api.mode.skyblock;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.techno.api.common.NamespaceKey;

public interface SkyBlockProfile {

  @NotNull
  SkyBlockInventory inventory();

  interface SkyBlockObject {

  }

  interface SkyBlockInventory extends SkyBlockObject {

    @NotNull
    @Unmodifiable
    Set<SkyBlockItem> storageItem();

    @Nullable
    SkyBlockItem offHandItem();

  }

  interface SkyBlockItem extends SkyBlockObject {

    short materialId();

    @NotNull
    NamespaceKey itemNamespaceKey();

  }

}
