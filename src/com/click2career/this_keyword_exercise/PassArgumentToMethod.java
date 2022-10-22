/*
4) this: to pass as an argument in the method
 */
package com.click2career.this_keyword_exercise;

public class PassArgumentToMethod {
    void method(PassArgumentToMethod obj) {
        System.out.println("method is invoked");
    }

    void pass() {
        method(this);
    }

    public static void main(String[] args) {
        PassArgumentToMethod passArgumentToMethod = new PassArgumentToMethod();
        passArgumentToMethod.pass();
    }
}
