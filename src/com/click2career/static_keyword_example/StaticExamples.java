package com.click2career.static_keyword_example;


// program  to demonstrate static variable,method and block.

public class StaticExamples {
    public Integer numberOfGears;
    public static Integer noOfWheel;  //this is the static data member of the class

    public static Integer noOfHeadlights;

    /**
     * Static block are only called once in the program
     * These are used for intializing the value of static data member
     */
    static {
        noOfWheel = 4;
        noOfHeadlights = 2;
    }

    public StaticExamples(Integer numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    /**
     * This is a static method, which is used to print the details of the students.
     * It can be called from the class without object creation.
     *
     * @param staticExamples
     */
    public static void carDetails(StaticExamples staticExamples) { //accepts obj as parameter because we need obj to access non-static data member of the class.
        System.out.println("The number of gear is " + staticExamples.numberOfGears);
        System.out.println("The number of wheel is  " + StaticExamples.noOfWheel);
        System.out.println("The number of headlight  is  " + StaticExamples.noOfHeadlights);
    }

    public static void main(String[] args) {
        StaticExamples staticExamples = new StaticExamples(6);
        carDetails(staticExamples); //calling static method without using the object of the class
    }
}