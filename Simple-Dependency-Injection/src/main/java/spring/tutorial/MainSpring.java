package spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.api.UsersRepository;

/**
 * Created by user on 2016-11-17.
 */
public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        UsersRepository usersRepository =
                context.getBean("userRepo", UsersRepository.class);
        usersRepository.createUser("Panie Janie");
    }
}
