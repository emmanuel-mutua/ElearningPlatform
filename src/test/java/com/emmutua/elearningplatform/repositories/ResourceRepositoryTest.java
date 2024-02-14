package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.learning_management.models.Resources;
import com.emmutua.elearningplatform.learning_management.repositories.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class ResourceRepositoryTest {
    @Autowired
    ResourceRepository resourceRepository;
    @Test
    void getAllResource(){
        List<Resources> resourcesList = resourceRepository.findAll();
        System.out.println("Resources" + resourcesList);
    }
}