package trainticketbooking.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import trainticketbooking.dao.UserRepository;

@SpringBootApplication()
public class Application {
    public static void main(String[] args) {
           SpringApplication.run(trainticketbooking.application.Application.class,args);

    }
}