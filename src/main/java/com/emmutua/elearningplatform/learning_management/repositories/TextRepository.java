package com.emmutua.elearningplatform.learning_management.repositories;

import com.emmutua.elearningplatform.learning_management.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Text, Integer> {
}
