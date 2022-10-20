/*
37.A non-empty array A of length n is called an array of all possibilities if it
contains all numbers between 0 and A.length-1 inclusive. Write the method
named isAllPossibilities that accepts an integer array and returns 1 if the
array is an array of all possibilities, otherwise it returns 0.
 */
package com.click2career.function_exercise;

public class ArrayOfAllPossibility {
    public static void main(String[] args) {
        int[]  arr = {1, 2, 0, 3};
        int result = allPossibilities(arr);
        if(result==1){
            System.out.println(" an array of all possibilities");
        }
        else {
            System.out.println(" Not an array of all possibilities");
        }
    }
    public static int allPossibilities(int[] inputArray)
    {
        boolean isNice = true, step = false;
        int i, j, x, y;
        for (i = 0; i < inputArray.length; i++)
        {
            step = false;
            for (j = 0; j < inputArray.length; j++)
            {
                if (inputArray[i] == j)
                    step = true;
            }
            if (j == inputArray.length && step == false)
            {
                isNice = false;
                break;
            }
        }
        return isNice == true ? 1 : 0;
    }
}
