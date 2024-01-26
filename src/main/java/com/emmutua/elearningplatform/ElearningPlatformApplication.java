package com.emmutua.elearningplatform;

import com.emmutua.elearningplatform.models.Author;
import com.emmutua.elearningplatform.models.Video;
import com.emmutua.elearningplatform.repositories.AuthorRepository;
import com.emmutua.elearningplatform.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElearningPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElearningPlatformApplication.class, args);
    }

//    @Bean
    public CommandLineRunner commandLineRunner(
            VideoRepository videoRepository
    ) {
        return (args) -> {
            
        };
    }
}
