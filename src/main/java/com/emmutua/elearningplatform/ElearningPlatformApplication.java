package com.emmutua.elearningplatform;

import com.emmutua.elearningplatform.models.Author;
import com.emmutua.elearningplatform.models.Course;
import com.emmutua.elearningplatform.models.Text;
import com.emmutua.elearningplatform.models.Video;
import com.emmutua.elearningplatform.repositories.AuthorRepository;
import com.emmutua.elearningplatform.repositories.CourseRepository;
import com.emmutua.elearningplatform.repositories.TextRepository;
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

    @Bean
    public CommandLineRunner commandLineRunner(
            CourseRepository courseRepository,
            TextRepository textRepository,
            VideoRepository videoRepository
    ) {
        return (args) -> {
//            Course course = Course.builder()
//                    .title("Java")
//                    .description("Learn Java")
//                    .build();
//            courseRepository.save(course);
//            Course course1 = Course.builder()
//                    .title("DSA")
//                    .description("Learn DSA")
//                    .build();
//            courseRepository.save(course1);
//            Author author = Author.builder()
//                    .firstname("Emmanuel")
//                    .lastname("Mutua")
//                    .email("emmamulwa2020@gmail.com")
//                    .build();
//            authorRepository.save(author);
            Text text = Text.builder()
                    .name("Java Explanation Text")
                    .resourceUrl("emmutua.com/DSA/vedio")
                    .build();
            textRepository.save(text);

            Video video = Video.builder()
                    .name("DSA Explanation Video")
                    .videoLength(60)
                    .resourceUrl("emmutua.com/DSA/vedio12")
                    .build();
            videoRepository.save(video);

        };
    }
}

