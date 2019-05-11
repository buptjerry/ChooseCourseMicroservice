package bupt.coder.choose_course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ChooseCourseApplication {

    @Bean
    @Profile("create")
    CommandLineRunner init(UserHasCourseRepository userHasCourseRepository) {
        return args -> {
            UserHasCourse userHasCourse = new UserHasCourse(1,1);
            UserHasCourse userHasCourse2 = new UserHasCourse(2, 2);
            UserHasCourse userHasCourse3 = new UserHasCourse(3, 3);
            UserHasCourse userHasCourse4 = new UserHasCourse(4, 4);
            UserHasCourse userHasCourse5 = new UserHasCourse(5, 5);
            userHasCourseRepository.save(userHasCourse);
            userHasCourseRepository.save(userHasCourse2);
            userHasCourseRepository.save(userHasCourse3);
            userHasCourseRepository.save(userHasCourse4);
            userHasCourseRepository.save(userHasCourse5);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ChooseCourseApplication.class, args);
    }

}
