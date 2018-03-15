package com.acme.edu.message;

import com.acme.edu.accum.Accumulator;
import com.acme.edu.formatter.Formatter;

public abstract class Message {
    protected Object message;

    public Message(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return getPrefics() + getMessage();
    }

    protected String getMessage() {
        return message.toString();
    }

    public abstract String getPrefics();
public void visit(Formatter visitor){
    visitor.printMe(this);
}
    public boolean isAppendable() {
        return false;
    }

    public Accumulator createAccumulator() {
        return null;
    }

    public Object getValue() {
        return message;
    }
}


