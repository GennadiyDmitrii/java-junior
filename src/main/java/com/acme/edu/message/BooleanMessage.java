package com.acme.edu.message;


public class BooleanMessage extends Message {

    private static final String PREFICS = "primitive: ";

    public BooleanMessage(Object message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFICS;
    }


}
