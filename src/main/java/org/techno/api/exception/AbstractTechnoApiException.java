package org.techno.api.exception;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractTechnoApiException extends Exception {

  protected AbstractTechnoApiException() {
    super();
  }

  protected AbstractTechnoApiException(@NotNull String message) {
    super(message);
  }

}
