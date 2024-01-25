package com.emmutua.elearningplatform.learn;

/**
 * Functional interfaces have single abstract method
 */
@FunctionalInterface
public interface FunctionalInterfaceToGetName {
    String getName();

}


/**
 * Lambda is anonymous/unnamed method
 * Now lambda expression does not execute on it-self but impl a method defined on a functional interface
 */

class MyClass{
    public static void main(String[] args) {
        FunctionalInterfaceToGetName functionalInterfaceToGetName = () -> "Emmanuel Mulwa";
        System.out.println(functionalInterfaceToGetName.getName());
    }
}