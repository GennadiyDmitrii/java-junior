package com.acme.edu.accum;

import com.acme.edu.Saver.ConsolePrinter;
import com.acme.edu.Saver.MessageSaver;
import com.acme.edu.formatter.Formatter;
import com.acme.edu.formatter.PrefixFormat;
import com.acme.edu.message.Message;

public class AccumController {
    private Message currentMessage;
    MessageSaver printer = new ConsolePrinter();
    private Accumulator accumulator = null;
    private Formatter visitor = new PrefixFormat(printer);


    // принимать -> запоминать ->  считать(int/byte/string) ->  выдавать при смене типа (String - есть пришла другая строка)

    public void acceptMessage(Message message) {
        if (message.isAppendable()) {
            if (accumulator == null) {
                reinitAccumulator(message);
            } else if (!accumulator.append(message)) {
                accumulator.getAccumulated().visit(visitor);
                reinitAccumulator(message);
            }
        } else {
            message.visit(visitor);
        }
    }



    private void reinitAccumulator(Message message) {
        accumulator = message.createAccumulator();
        accumulator.append(message);
    }

    public void flush() {
        accumulator.getAccumulated().visit(visitor);
        accumulator = null;
    }
}
