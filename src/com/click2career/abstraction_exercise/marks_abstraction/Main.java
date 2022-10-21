/*
3. We have to calculate the percentage of marks obtained in three subjects (each out
of 100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by
two other classes 'A' and 'B' each having a method with the same name which
returns the percentage of the students. The constructor of student A takes the
marks in three subjects as its parameters and the marks in four subjects as its
parameters for student B. Create an object for each of the two classes and print the
percentage of marks for both the students.

 */
package com.click2career.abstraction_exercise.marks_abstraction;

public class Main {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(80.0F, 30.0F, 70.0F);
        StudentB studentB = new StudentB(70.5F,34.3F,45.3F,67.55F);
        System.out.println("The percentage of student A is "+studentA.getPercentage());
        System.out.println("The percentage of student B is "+studentB.getPercentage());
    }
}
