package spring.tutorial.implementations;

import spring.tutorial.api.Logger;

import java.util.Date;

/**
 * Created by user on 2016-11-17.
 */
public class LoggerImpl implements Logger {

    private String name;
    private int version;

    public void log(String message) {
        System.out.println(new Date() + ": [[ " + name + " ]  [ " + version + "  ] ]  " + message);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
