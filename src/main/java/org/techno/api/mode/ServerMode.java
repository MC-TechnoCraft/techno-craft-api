package org.techno.api.mode;

import org.jetbrains.annotations.NotNull;

public interface ServerMode {

  @NotNull
  String name();

  @NotNull
  String description();

  int currentOnline();

}
