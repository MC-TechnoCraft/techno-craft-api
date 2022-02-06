package org.techno.api.common;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class NamespaceKey {

    private final String namespace;
    private final String key;

    public NamespaceKey(@NotNull String namespace, @NotNull String key) {
        this.namespace = Objects.requireNonNull(namespace);
        this.key = Objects.requireNonNull(key);
    }

    @NotNull
    public String getKey() {
        return key;
    }

    @NotNull
    public String getNamespace() {
        return namespace;
    }

    @Override
    public String toString() {
        return namespace + ":" + key;
    }
}
