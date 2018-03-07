package com.acme.edu.message;

import com.acme.edu.Flusher;
import com.acme.edu.MessageController;

public class IntMessage implements Message {

    private int message;
    private static int intBuffer;
    private static boolean intUsage;

    public IntMessage(int message) {
        this.message = message;
    }

    public static int getIntBuffer() {
        return intBuffer;
    }

    @Override
    public boolean isUsed() {
        return intUsage;
    }

    @Override
    public void accumulate() {
        if ((intBuffer+message)<=Integer.MAX_VALUE && (intBuffer+message)>=Integer.MIN_VALUE){
            intBuffer +=message;
        }else if ((intBuffer+message)>Integer.MAX_VALUE){
            long overBuffer = intBuffer+message;
            overBuffer=overBuffer-Integer.MAX_VALUE;
            int needToFlush = Integer.MAX_VALUE;
            MessageController.overFlush(needToFlush);
            intBuffer = (int) overBuffer;
        } else if((intBuffer+message)<Integer.MIN_VALUE){
            long overBuffer = intBuffer+message;
            overBuffer=overBuffer-Integer.MIN_VALUE;
            int needToFlush = Integer.MIN_VALUE;
            MessageController.overFlush(needToFlush);
            intBuffer = (int) overBuffer;
        }
        intUsage = true;

        Flusher.setBuffer(intBuffer);
        Flusher.setUsage(intUsage);
    }

    @Override
    public void flush() {
        intBuffer = 0;
        intUsage = false;
    }
}
