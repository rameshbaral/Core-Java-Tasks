package com.click2career.Java8features.functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String args[]) {

        // This function returns a random value.
        Supplier<Double> randomValue = () ->  Math.random();

        // Print the random value using get()
        System.out.println("the random value is" +randomValue.get());
    }
}
