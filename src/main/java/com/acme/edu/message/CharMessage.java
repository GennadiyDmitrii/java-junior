package com.acme.edu.message;

public class CharMessage extends Message {

    private static final String PREFICS = "char: ";

    public CharMessage(char message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFICS;
    }
}
