/*
6) this keyword can be used to return current class instance

 */
package com.click2career.abstraction_exercise.this_keyword_exercise;

public class ReturnCurrentClassInstance {
    ReturnCurrentClassInstance getCurrentClass() {
        return this;
    }

    void msg() {
        System.out.println("Hello java");
    }

    public static void main(String[] args) {
        new ReturnCurrentClassInstance().getCurrentClass().msg();
    }
}
