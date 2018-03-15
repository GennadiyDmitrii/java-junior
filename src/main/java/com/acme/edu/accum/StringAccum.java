package com.acme.edu.accum;

import com.acme.edu.message.Message;
import com.acme.edu.message.StringMessage;

public class StringAccum implements Accumulator {
//    private String accumulated = "";
//    private String LastAccumulated = "";
//    private int stringCount = 0;

    @Override
    public boolean append(Message message) {
        if (message instanceof StringMessage) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Message getAccumulated() {
        return null;
    }
}


