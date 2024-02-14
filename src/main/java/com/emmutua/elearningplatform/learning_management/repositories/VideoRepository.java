package com.emmutua.elearningplatform.learning_management.repositories;

import com.emmutua.elearningplatform.learning_management.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {
}
