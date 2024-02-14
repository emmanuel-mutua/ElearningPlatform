package com.emmutua.elearningplatform.learning_management.repositories;

import com.emmutua.elearningplatform.learning_management.models.Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resources, Integer> {

}
