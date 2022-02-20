package org.techno.api.common;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public final class NamespaceKey {

  private final String namespace;
  private final String key;

  public NamespaceKey(@NotNull String namespace, @NotNull String key) {
    this.namespace = Objects.requireNonNull(namespace);
    this.key = Objects.requireNonNull(key);
  }

  @NotNull
  public String key() {
    return key;
  }

  @NotNull
  public String namespace() {
    return namespace;
  }

  @Override
  public String toString() {
    return namespace + ":" + key;
  }
}
