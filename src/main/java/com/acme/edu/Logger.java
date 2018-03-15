package com.acme.edu;

//kdjghdfkgjhdfkgjhdfkgj
/*
gkjfhkgjfhg
лоралопралопр
лпораплорапл
 */


import com.acme.edu.controller.Controller;
import com.acme.edu.controller.ControllerImpl;

/**
 * Logs messages.
 *
 * @param
 * @author EK
 * @see
 */
public class Logger {


    private static final Controller controller = new ControllerImpl();

    public static void log(byte message) {
        controller.log(message);
    }

    public static void log(int message) {
        controller.log(message);
    }

    public static void log(char message) {
        controller.log(message);
    }

    public static void log(boolean message) {
        controller.log(message);
    }

    public static void log(String message) {
        controller.log(message);
    }

    public static void log(String... message) {
        controller.log(message);
    }

    public static void log(int... message) {
        controller.log(message);
    }

    public static void log(int[][] message) {
        controller.log(message);
    }

    public static void log(int[][][][] message) {
        controller.log(message);
    }

    public static void log(Object message) {
        controller.log(message);
    }


    public static void flush() {
        controller.flush();
    }
}
