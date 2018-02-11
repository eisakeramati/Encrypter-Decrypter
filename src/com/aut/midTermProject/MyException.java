package com.aut.midTermProject;

/**
 * Created by lenovo pc on 3/30/2017.
 */

/**
 * this is an exception created individually for handeling errors of our own
 * when an instance is created in the program the constructor gets a String and puts it as the message
 */
public class MyException extends Exception {
    public MyException(String msg)
    {
        super("problem :" + msg);
    }
}
