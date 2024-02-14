package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.learning_management.models.Video;
import com.emmutua.elearningplatform.learning_management.repositories.VideoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VideoRepositoryTest {
    @Autowired
    VideoRepository videoRepository;
    @Test
    void saveVideo(){
        Video video = Video.builder()
                .name("Intro to java")
                .videoLength(10)
                .resourceUrl("youtube.com/introJava")
                .build();
        videoRepository.save(video);
    }
}