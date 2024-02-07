package com.emmutua.elearningplatform;

public class MyReadMe {
    /**
     * Spring data - all about how do you interact with your  (Repositories, transactions, audit)
     * Research on Object/relation mapping, Persistence, Jpa, Spring data jpa, JDBC, Hibernate
     * <p>
     * <p>
     * - Writing sql queries can be really difficult for complex table structures,
     * - There comes Hibernate Map Java bean/Entity to a table and I will generate the queries(tell me what to do and i will do that),
     * - this is called ORM (Object relation mapping)
     * - Hibernate is ORM Framework
     * - JPA Is an Interface, defines how you can map an entity to a table, perform operations to the tables
     * - Hibernate impl JPA (Does all things can be done in JPA)
     * - Spring data jpa is an abstraction layer on top of JPA, That reduces the boilerplate code required to impl DAO
     * <p>
     * Relationship -> Connection between pieces of data
     * -> Model real world /Good structure in db, avoid redadancy, model real world scenarios, ensure integrity
     * <p>
     * Unidirectional relationship ->  Means that one entity has a relationship with another but the other does not have the corresponding relationship with other
     * Bidirectional -> Both entities have relationship, more care to maintain, complex, but allow you to navigate well in between
     * <p>
     * Repository - abstraction to reduce boilerplate code req to impl DAO, perform CRUD
     * <p>
     * Inheritance ensures
     * -Code reuse and modularity
     * -Simplified queries
     * - When making change to the base class you should be careful about the child classes
     * <p>
     * - Try composition
     * -
     * <p>
     * <p>
     * We want a base entity/ Abstract entity for common fields id, createdAt, lastModifiedAt, createdBy, lastModifiedBy
     * The base class should have the annotation with @MappedSuperClass - mapped to database table, has common properties (Other classes will inherit)
     */


/**
 * Relationship -> Connection between pieces of data
 *  -> Model real world /Good structure in db, avoid redudancy, model real world scenarios, ensure integrity
 *
 *  Unidirectional relationship ->  Means that one entity has a relationship with another but the other does not have the corresponding relationship with other
 *  Bidirectional -> Both entities have relationship, more care to maintain, complex, but allow you to navigate well in between
 */

/**
 * Repository - abstraction to reduce boilerplate code req to impl DAO, perform CRUD
 */

/**
 * Inheritance ensures
 * -Code reuse and modularity
 * -Simplified queries
 * - When making change to the base class you should be careful about the child classes
 *
 * - Try composition
 * -
 *
 */

/**
 * We want a base entity/ Abstract entity for common fields id, createdAt, lastModifiedAt, createdBy, lastModifiedBy
 * The base class should have the annotation with @MappedSuperClass - mapped to database table, has common properties (Other classes will inherit)
 */

/**
 * Single table strategy
 * Join strategy - each sub-class has its own table joined with foreign keys - will have table per class
 *
 * Table per class - has its own properties, and copy of all properties of the super class ..good for small number of classes and you want to optimize queries
 */

/**
 * DataStructure: Can use set to store data in scenarios where you want unique values, search operations are very fast using set
 */

/**
 * You can create composite pks, eg with orders in an ecommerce application, we can not use username as pk, as we can have many orders for a certain user
 * but we can compine username and something like order-date to come up with a composite pk
 *
 * You can have a look at Faker<> Obj
 * Update Query in JPA Should have @modifying - useful when you want to perfrom bulk updates
 * Transactions ->
 *      software transactions ensure data integrity. Transactions control the concurrent access of data by multiple programs. In the event of a system failure, transactions make sure that after recovery, the data will be in a consistent state.
 *
 *
 *  Named queries - > Optimize the performance of applications
 *                  -> Centralized management
 *                  -> Used for complex queries
 *                  -> Improve code readablity
 *                  -> Organize and update query
 *
 *
 *
 */

//TODO LEARN JPA DYNAMIC QUERY AND DATABASE TRANSACTIONS

}
