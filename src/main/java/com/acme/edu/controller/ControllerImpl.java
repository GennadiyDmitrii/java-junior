package com.acme.edu.controller;

import com.acme.edu.Saver.ConsolePrinter;
import com.acme.edu.Saver.MessageSaver;
import com.acme.edu.accum.AccumController;
import com.acme.edu.message.*;

public class ControllerImpl implements Controller {
    private int intCaster;

    private byte byteCaster;

    private String stringCaster = "0";
    private int stringCounter = 1;
    private MessageSaver printer = new ConsolePrinter();
    private AccumController accumController = new AccumController();

    @Override
    public void log(byte message) {
        Message mess = new ByteMessage(message);
        accumController.acceptMessage(mess);

//        if (message == Byte.MAX_VALUE) {
//            printer.printMessage(new ByteMessage(byteCaster));
//            printer.printMessage(mess);
//            byteCaster = 0;
//        }
//        byteCaster += message;
//        if (message == 0) {
//            printer.printMessage(mess);
//        }
    }

    @Override
    public void log(int message) {
        Message mess = new IntMessage(message);
        accumController.acceptMessage(mess);


//        if (message == Integer.MAX_VALUE) {
//            printer.printMessage(new IntMessage(intCaster));
//            printer.printMessage(mess);
//            intCaster = 0;
//        }
//        intCaster += message;
//        if (message == 0) {
//            printer.printMessage(mess);
//        }
    }

    @Override
    public void log(boolean message) {
        Message mess = new BooleanMessage(message);
        accumController.acceptMessage(mess);
//        if (intCaster != 0) {
//            printer.printMessage(new IntMessage(intCaster));
//            intCaster = 0;
//        }
//        if (byteCaster != 0) {
//            printer.printMessage(new ByteMessage(byteCaster));
//            byteCaster = 0;
//        }
    //    printer.printMessage(mess);

    }

    @Override
    public void log(String message) {
Message mess = new StringMessage(message);
accumController.acceptMessage(mess);

        /*
        if (handle == null) {
            handler = new StringHandler();
            handler.onNewData(message);
        } else if (handel.getType() == Types.STRING) {
            handler.onNewData(message);
        } else {
            handler.flush();
            handler = new StringHandler();
            handler.onNewData(message);
        }
*/
//        if (intCaster != 0) {
//            printer.printMessage(new IntMessage(intCaster));
//            intCaster = 0;
//        }
//        if (byteCaster != 0) {
//            printer.printMessage(new ByteMessage(byteCaster));
//            byteCaster = 0;
//        }
//
//        if (stringCaster.equals("0")) {
//            stringCaster = message;
//        } else {
//            if (stringCaster.equals(message)) {
//
//            }
//            String newMessage = stringCaster + stringCounter;
//            printer.printMessage(new StringMessage(stringCaster));
//            stringCaster = message;
//            stringCounter = 1;
//        }
        //stringCaster=message;
    }

    @Override
    public void log(String... message) {
        if (intCaster != 0) {
      //      printer.printMessage(new IntMessage(intCaster));
            intCaster = 0;
        }
        if (byteCaster != 0) {
     //       printer.printMessage(new ByteMessage(byteCaster));
            byteCaster = 0;
        }
        for (String mess : message) {
            System.out.println(mess);
        }
    }

    @Override
    public void log(int... message) {
        System.out.print("primitives array: {");
        for (int i = 0; i < message.length; i++) {
            if (i == (message.length - 1)) {
                System.out.println(message[i] + "}");
            } else {
                System.out.print(message[i] + ", ");
            }
        }
    }

    @Override
    public void log(int[][] message) {

        Message mess = new MatrixMessage(message);

       // printer.printMessage(mess);
    }

    @Override
    public void log(int[][][][] message) {
        System.out.println("primitives multimatrix: {");
        for (int i = 0; i < message.length; i++) {
            System.out.println("{");
            for (int j = 0; j < message[i].length; j++) {
                System.out.println("{");
                for (int k = 0; k < message[i][j].length; k++) {
                    System.out.println("{");
                    for (int l = 0; l < message[i][j][k].length; l++) {
                        if (l == (message[i][j][k].length - 1)) {
                            System.out.println(message[i][j][k][l]);
                            System.out.println("}");
                        } else {
                            System.out.println(message[i][j][k][l] + ", ");
                        }
                    }
                    System.out.println("}");
                }
                System.out.println("}");
            }
            System.out.println("}");
        }
    }

    @Override
    public void log(Object message) {
        Message mess = new ObjectMessage(message);
        if (intCaster != 0) {
        //    printer.printMessage(new IntMessage(intCaster));
            intCaster = 0;
        }
        if (byteCaster != 0) {
         //   printer.printMessage(new ByteMessage(byteCaster));
            byteCaster = 0;
        }
       // printer.printMessage(mess);
    }

    @Override
    public void log(char message) {
        Message mess = new CharMessage(message);
        if (intCaster != 0) {
       //     printer.printMessage(new IntMessage(intCaster));
            intCaster = 0;
        }
        if (byteCaster != 0) {
    //        printer.printMessage(new ByteMessage(byteCaster));
            byteCaster = 0;
        }
   //     printer.printMessage(mess);

    }

    @Override
    public void flush() {
        accumController.flush();
    }


}
