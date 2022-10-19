/*
32.Write a Java method to display the current date and time.

 */
package com.click2career.function_exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        displayCurrentDate();
        displayCurrentTime();
    }
    //prints current time
    private static void displayCurrentTime() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Current time: "+df.format(time));
    }
    //prints current date
    private static void displayCurrentDate() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Current date: "+df.format(date));
    }
}
