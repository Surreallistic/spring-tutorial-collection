package spring.tutorial.api;

import spring.tutorial.domain.User;

/**
 * Created by user on 2016-11-17.
 */
public interface UsersRepository {
    User createUser(String name);
    void setLogger(Logger logger);
}
