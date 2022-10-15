package com.click2career.array_exercise;

public class NegativeNumberToOneSide {
    private static int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, -6, -7, 10};

    public static void main(String[] args) {
        System.out.println("before rearranging");
        displayArrayElement(arr);
        System.out.println();
        System.out.println("after sorting");
        sortArray(arr);
        displayArrayElement(arr);
    }

    //sorts the element of array
    private static void sortArray(int[] arr) {
        //bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for( int j = 0; j<arr.length-i-1;j++){
                //if value of the element at current index is greater than that of the upcoming index then perform swapping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //displays element of array
    private static void displayArrayElement(int[] arr) {
        System.out.println("the elements of array are");
        for (int i = 0; i<arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
