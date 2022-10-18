/*
1. Create a class called MainProgram and inside the class create a function called
display() with no parameters and inside a body of display method add a line
“Hello, I am called”. Call the function from the main method of MainProgram by
creating the object of MainProgram
 */
package com.click2career.function_exercise;

public class MainProgram {
    //prints the message
    public void display(){
        System.out.println("Hello, I am called");
    }

    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.display();
    }
}
