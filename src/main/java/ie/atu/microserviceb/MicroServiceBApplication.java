package ie.atu.microserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceBApplication.class, args);
    }

}
