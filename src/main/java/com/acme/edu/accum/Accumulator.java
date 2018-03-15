package com.acme.edu.accum;

import com.acme.edu.message.Message;

public interface Accumulator {
    boolean append(Message message);

    Message getAccumulated();
}
