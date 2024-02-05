package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Integer> {
}
