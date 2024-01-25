package com.emmutua.elearningplatform;

import com.emmutua.elearningplatform.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElearningPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElearningPlatformApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository
    ){
        return args -> {

        };
    }

}

/**
 * Spring data - all about how do you interact with your  (Repositories, transactions, audit)
 * Research on Object/relation mapping, Persistence, Jpa, Spring data jpa, JDBC, Hibernate
 *
 *
 * - Writing sql queries can be really difficult for complex table structures,
 * - There comes Hibernate Map Java bean/Entity to a table and I will generate the queries(tell me what to do and i will do that),
 * - this is called ORM (Object relation mapping)
 * - Hibernate is ORM Framework
 * - JPA Is an Interface, defines how you can map an entity to a table, perform operations to the tables
 * - Hibernate impl JPA (Does all things can be done in JPA)
 * - Spring data jpa is an abstraction layer on top of JPA, That reduces the boilerplate code required to impl DAO
 */

/**
 * Repository - abstraction to reduce boilerplate code req to impl DAO, perform CRUD
 */
