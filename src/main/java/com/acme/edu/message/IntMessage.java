package com.acme.edu.message;

import com.acme.edu.accum.Accumulator;
import com.acme.edu.accum.IntAccum;

public class IntMessage extends Message {
    private static final String PREFICS = "primitive: ";

    public IntMessage(int message) {
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
        return new IntAccum();
    }
}
