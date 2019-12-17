package com.github.badsyntax.gradletasks.server.messages;

public class GenericErrorMessage extends GenericMessage {

    private static String TYPE = "ERROR";

    public GenericErrorMessage(String message) {
        super(message, TYPE);
    }
}
