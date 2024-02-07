package com.emmutua.elearningplatform.repositories;

import com.emmutua.elearningplatform.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findByFirstnameIgnoreCase(String firstName);

    List<Author> findAllByFirstnameContainingIgnoreCase(String name);

    @Query("SELECT a FROM Author a WHERE LOWER(a.firstname) LIKE %:name%")
    List<Author> findAllByFirstnameIgnoreCharacterArrangement(String name);

//    @Transactional
//    @Modifying
//    void updateAllByAge(@Param("age") int age);
}
