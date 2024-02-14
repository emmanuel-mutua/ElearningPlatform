package com.emmutua.elearningplatform.learning_management.repositories;

import com.emmutua.elearningplatform.learning_management.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Integer> {
}
