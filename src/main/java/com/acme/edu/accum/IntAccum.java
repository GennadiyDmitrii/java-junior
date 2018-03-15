package com.acme.edu.accum;

import com.acme.edu.message.IntMessage;
import com.acme.edu.message.Message;

public class IntAccum implements Accumulator {
//принимает инты -> складывает -> передаёт

    private int accumulated = 0;


    @Override
    public boolean append(Message message) {
        if (message instanceof IntMessage) {
            accumulated += (Integer) message.getValue();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Message getAccumulated() {
        return new IntMessage(accumulated);
    }
}
