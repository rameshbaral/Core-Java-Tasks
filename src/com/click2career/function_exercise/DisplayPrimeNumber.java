/*
13.WAP that displays all the prime numbers between 1 and 1000. Use the above
checkPrime function to identify the prime number.
 */
package com.click2career.function_exercise;
//displays the range of prime number in parameter
public class DisplayPrimeNumber {
    public void displayPrimeNumber(int start, int finish) {
        System.out.println("List of Prime numbers is ");
        if (start < 2) {
            System.out.print("2, ");
            start = 3;
        }
        for (int i = start; i <= finish; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
                else {
                    System.out.print(i + ", ");
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
        DisplayPrimeNumber p = new DisplayPrimeNumber();
        p.displayPrimeNumber(1,1000);
    }

}
