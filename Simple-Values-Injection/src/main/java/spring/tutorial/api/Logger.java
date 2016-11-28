package spring.tutorial.api;

/**
 * Created by user on 2016-11-17.
 */
public interface Logger {
    void log(String message);
    void setName(String name);
    void setVersion(int version);
}
