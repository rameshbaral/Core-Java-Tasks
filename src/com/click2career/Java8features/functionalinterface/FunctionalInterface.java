package com.click2career.Java8features.functionalinterface;

// Java program to demonstrate functional interface without using lamda expression

class FunctionalInterface implements Sayable{

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface saySomething = new FunctionalInterface();
        saySomething.say("Hello there");
    }
}
