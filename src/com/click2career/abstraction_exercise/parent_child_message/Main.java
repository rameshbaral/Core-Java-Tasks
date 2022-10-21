package com.click2career.abstraction_exercise.parent_child_message;

public class Main {
    public static void main(String[] args) {
        FirstSubClass firstSubClass = new FirstSubClass();
        firstSubClass.message();
        SecondSubClass secondSubClass = new SecondSubClass();
        secondSubClass.message();
    }
}
