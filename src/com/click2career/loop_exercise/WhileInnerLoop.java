/*
37. WAP to print “Hello, this is while inner loop” from inner loop using while.
 */
package com.click2career.loop_exercise;

public class WhileInnerLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count<1){
            while (count<1){
                System.out.println("Hello, this is while inner loop");
                count++;
            }
        }
    }
}
