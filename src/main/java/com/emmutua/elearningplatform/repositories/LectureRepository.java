package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Integer> {
}
