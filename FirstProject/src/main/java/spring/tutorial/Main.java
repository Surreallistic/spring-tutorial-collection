package spring.tutorial;

import spring.tutorial.api.Logger;
import spring.tutorial.api.UsersRepository;
import spring.tutorial.domain.User;
import spring.tutorial.implementations.LoggerImpl;
import spring.tutorial.implementations.UsersRepositoryImpl;

/**
 * Created by user on 2016-11-17.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);

        User user = usersRepository.createUser("Jack");
    }
}
