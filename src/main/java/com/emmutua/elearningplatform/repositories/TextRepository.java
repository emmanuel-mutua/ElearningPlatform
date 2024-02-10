package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Text, Integer> {
}
