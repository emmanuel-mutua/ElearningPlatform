package com.emmutua.elearningplatform;

import com.emmutua.elearningplatform.user_management.dtos.RegisterRequest;
import com.emmutua.elearningplatform.user_management.enums.Role;
import com.emmutua.elearningplatform.user_management.models.User;
import com.emmutua.elearningplatform.user_management.repositories.UserRepository;
import com.emmutua.elearningplatform.user_management.services.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningPlatformApplication.class, args);
    }

//    @Bean
    CommandLineRunner commandLineRunner(AuthenticationService authService) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@gmail.com")
                    .role(Role.ADMIN)
                    .password("1111")
                    .build();

            System.out.println("Admin Token" + authService.register(admin).getToken());

            var moderator = RegisterRequest.builder()
                    .firstname("Moderator")
                    .lastname("Moderator")
                    .email("moderator@gmail.com")
                    .role(Role.MODERATOR)
                    .password("1111")
                    .build();

            System.out.println("Moderator Token" + authService.register(moderator).getToken());

            var user = RegisterRequest.builder()
                    .firstname("User")
                    .lastname("User")
                    .email("user@gmail.com")
                    .role(Role.USER)
                    .password("1111")
                    .build();

            System.out.println("User Token" + authService.register(user).getToken());

        };
    }
}
