/*
37. Write a java program to convert an arrayList to an array.
 */
package com.click2career.array_exercise;

import java.util.ArrayList;

public class ConvertArrayListToArray {

    private static String[] arr;
    // Create a new array of String type
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList<>();
        // Add elements in the list
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println("ArrayList: " + fruits);
        convertToArray(fruits);

    }
    //
    private static void convertToArray(ArrayList fruits) {
        arr = new String[fruits.size()];
        fruits.toArray(arr);
        System.out.print("Array: ");
        for(String item:arr) {
            System.out.print(item+", ");
        }
    }
}
