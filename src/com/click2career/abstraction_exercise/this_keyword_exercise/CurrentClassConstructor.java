/*
3) this() : to invoke current class constructor
 */
package com.click2career.abstraction_exercise.this_keyword_exercise;

public class CurrentClassConstructor {
    CurrentClassConstructor() {
        System.out.println("hello there");
    }
    CurrentClassConstructor(int r){
        //3) this() : to invoke current class constructor
        this();
        System.out.println(r);
    }

    public static void main(String[] args) {
        CurrentClassConstructor currentClassConstructor = new CurrentClassConstructor(100);
    }
}
