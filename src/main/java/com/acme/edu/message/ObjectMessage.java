package com.acme.edu.message;

public class ObjectMessage extends Message {

    private static final String PREFICS = "reference: ";

    public ObjectMessage(Object message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFICS;
    }
}
