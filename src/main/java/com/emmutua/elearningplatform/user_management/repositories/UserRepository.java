package com.emmutua.elearningplatform.user_management.repositories;

import com.emmutua.elearningplatform.user_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}