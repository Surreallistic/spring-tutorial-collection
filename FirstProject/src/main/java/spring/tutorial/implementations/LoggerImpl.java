package spring.tutorial.implementations;

import spring.tutorial.api.Logger;

import java.util.Date;

/**
 * Created by user on 2016-11-17.
 */
public class LoggerImpl implements Logger {
    public void log(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
