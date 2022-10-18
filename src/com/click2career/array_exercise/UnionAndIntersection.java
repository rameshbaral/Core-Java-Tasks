/*
28. Find the Union and Intersection of the two sorted arrays.
 */
package com.click2career.array_exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 4, 5, 3, 2, 1, 5, 6, 7,6,3,3};
        Integer[] arr2 = {4, 3, 7, 6, 4, 10, 12, 13, 5,4,6};
        System.out.print("First Array Elements: ");
        displayArrayElement(arr1);
        System.out.println("");
        System.out.print("First Array Elements: ");
        displayArrayElement(arr2);
        System.out.println("");
        displayUnion(arr1, arr2);
        displayIntersection(arr1, arr2);

    }
    //displays
    private static void displayIntersection(Integer[] arr1, Integer[] arr2) {
        List<Integer> firstList = Arrays.asList(arr1);
        List<Integer> secondList = Arrays.asList(arr2);
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(firstList);
        set.retainAll(secondList);
        Integer[] intersection = {};
        intersection = set.toArray(intersection);
        System.out.println("Intersection of arrays: "+Arrays.toString(intersection));
    }

    //displays the union of two input array
    private static void displayUnion(Integer[] array, Integer[] arr2) {
        List<Integer> firstList = Arrays.asList(array);
        List<Integer> secondList = Arrays.asList(arr2);
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(firstList);
        set.addAll(secondList);
        Integer[] union = {};
        union = set.toArray(union);
        System.out.println("Union of arrays: "+Arrays.toString(union));
    }


    //displays element of array
    private static void displayArrayElement(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}


