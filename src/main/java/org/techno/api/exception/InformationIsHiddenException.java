package org.techno.api.exception;

public final class InformationIsHiddenException extends AbstractTechnoApiException {

    public InformationIsHiddenException() {
        super("This information is hidden! To show this information open api settings on server and enable it.");
    }

}
