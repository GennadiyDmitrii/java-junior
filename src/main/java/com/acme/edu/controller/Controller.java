package com.acme.edu.controller;


public interface Controller {
    void log(byte message);

    void log(int message);

    void log(boolean message);

    void log(String message);

    void log(String... message);

    void log(int... message);

    void log(int[][] message);

    void log(int[][][][] message);

    void log(Object message);

    void log(char message);

    void flush();
}
