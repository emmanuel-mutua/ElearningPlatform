package com.emmutua.elearningplatform.learn;

/**
 * Functional interfaces have single abstract method
 */
@FunctionalInterface
public interface FunctionalInterfaceToGetName {
    String getName(String id);
}


/**
 * Lambda is anonymous/unnamed method
 * Now lambda expression does not execute on it-self but impl a method defined on a functional interface
 */

class MyClass{
    public static void main(String[] args) {
        FunctionalInterfaceToGetName functionalInterfaceToGetName = (id) -> "Emmanuel Mulwa";
        System.out.println(functionalInterfaceToGetName.getName("dkfalfajfla"));
    }
}