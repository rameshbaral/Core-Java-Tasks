/*
10. Write a do-while loop that asks the user to enter two numbers. The numbers should be added
and the sum displayed. The loop should ask the user whether he or she wishes to perform the
operation again. If so, the loop should repeat; otherwise it should terminate.
 */
package com.click2career.loop_exercise;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter 2 number to sum ");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int sum = add(first,second);
            System.out.println("Sum is "+ sum);
            System.out.println("enter 0 for exit enter any other to continue");
            int input = scanner.nextInt();
            if(input == 0)
                break;
        }
    }
    //adds 2 number
    private static int add(int first, int second) {
        return first + second;
    }
}
