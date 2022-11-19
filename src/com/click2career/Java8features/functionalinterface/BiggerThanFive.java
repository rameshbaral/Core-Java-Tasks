//predicate Example
package com.click2career.Java8features.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class BiggerThanFive implements Predicate<Integer> {


    @Override
    public boolean test(Integer v) {

        Integer five = 5;

        return v > five;
    }
}



