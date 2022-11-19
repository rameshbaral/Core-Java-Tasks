//predicate example
package com.click2career.Java8features.functionalinterface;

import java.util.List;

public class JavaPredicateEx {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

        BiggerThanFive btf = new BiggerThanFive();
        nums.stream().filter(btf).forEach(System.out::println);
    }
}