package com.acme.edu.Saver;

import com.acme.edu.message.Message;

public class ConsolePrinter implements MessageSaver {

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }


}
