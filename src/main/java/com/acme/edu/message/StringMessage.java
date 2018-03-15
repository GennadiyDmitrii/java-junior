package com.acme.edu.message;

import com.acme.edu.accum.Accumulator;
import com.acme.edu.accum.StringAccum;

public class StringMessage extends Message {

    private static final String PREFICS = "string: ";



    public StringMessage(Object message) {
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
        return new StringAccum();
    }
}
