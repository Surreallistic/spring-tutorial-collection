package spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.api.UsersRepository;

/**
 * Created by user on 2016-11-28.
 */
public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        UsersRepository userRepo = context.getBean(
                "userRepo", UsersRepository.class);

        userRepo.createUser("Taco");
    }
}
