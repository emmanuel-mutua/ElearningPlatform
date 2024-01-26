package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.models.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resources, Integer> {
}
