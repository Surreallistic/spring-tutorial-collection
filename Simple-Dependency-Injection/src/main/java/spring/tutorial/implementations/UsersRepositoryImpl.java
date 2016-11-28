package spring.tutorial.implementations;

import spring.tutorial.api.Logger;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.domain.User;

/**
 * Created by user on 2016-11-17.
 */
public class UsersRepositoryImpl implements UsersRepository {
    private Logger logger;

    public User createUser(String name) {
        logger.log("Tworzenie użytkownika: " + name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
