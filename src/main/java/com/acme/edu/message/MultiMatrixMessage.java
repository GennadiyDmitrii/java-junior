package com.acme.edu.message;

public class MultiMatrixMessage extends Message {

    private static final String PREFIX = "primitives multimatrix: {";

    public MultiMatrixMessage(Object message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFIX;
    }
}
