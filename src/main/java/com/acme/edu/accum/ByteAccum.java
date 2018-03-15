package com.acme.edu.accum;

import com.acme.edu.message.ByteMessage;
import com.acme.edu.message.Message;

public class ByteAccum implements Accumulator {

    private byte accumulated = 0;


    @Override
    public boolean append(Message message) {
        if (message instanceof ByteMessage) {
            accumulated += (Byte) message.getValue();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Message getAccumulated() {
        return new ByteMessage(accumulated);
    }
}
