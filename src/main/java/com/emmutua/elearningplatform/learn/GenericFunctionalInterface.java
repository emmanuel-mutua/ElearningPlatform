package com.emmutua.elearningplatform.learn;

import org.springframework.context.annotation.Bean;

/**
 * Generic Functional interfaces (They can allow any data type)
 */
@FunctionalInterface
public interface GenericFunctionalInterface<T> {
    T func(T arg);
}


/**
 * Lambda is anonymous/unnamed method
 * Now lambda expression does not execute on it-self but impl a method defined on a functional interface
 */

class MyClass{
    public static void main(String[] args) {
        //Get name
        GenericFunctionalInterface<String> genericFunctionalInterface = (id) -> "Emmanuel Mulwa";
        System.out.println(genericFunctionalInterface.func("dfjkafl"));
        
        Double myDouble = 2.12;
        GenericFunctionalInterface<Double>  genericFunctionalInterface1= (myDoubleArg) -> {
            double v = myDoubleArg * myDoubleArg;
            return v;
        };

        System.out.println(genericFunctionalInterface1.func(myDouble));
    }
}