package com.acme.edu.formatter;

import com.acme.edu.Saver.MessageSaver;
import com.acme.edu.message.Message;

public class PrefixFormat implements Formatter {

    private MessageSaver saver;

    public PrefixFormat(MessageSaver saver){
        this.saver = saver;
    }
    @Override
    public void printMe(Message message) {
        saver.printMessage(message.getPrefics() + message);
    }


}
