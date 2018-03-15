package com.acme.edu.message;

import com.acme.edu.accum.Accumulator;
import com.acme.edu.accum.ByteAccum;

public class ByteMessage extends Message {

    private static final String PREFICS = "primitive: ";

    public ByteMessage(byte message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFICS;
    }

    @Override
    public boolean isAppendable() {
        return true;
    }

    @Override
    public Accumulator createAccumulator() {
        return new ByteAccum();
    }
}
