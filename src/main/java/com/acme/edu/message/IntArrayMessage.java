package com.acme.edu.message;

public class IntArrayMessage extends Message {

    private static final String PREFIX = "primitives array: {";

    public IntArrayMessage(Object message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFIX;
    }
}
