package com.emmutua.elearningplatform.learning_management.repositories;

import com.emmutua.elearningplatform.learning_management.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> {
}
