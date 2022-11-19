/*
1. Create a class with a method that prints "This is parent class" and its subclass
with another method that prints "This is child class". Now, create an object for
each of the class and call
1 -method of parent class by object of parent class
2 -method of child class by object of child class
3 -method of parent class by object of child class
*/

package com.click2career.inheritance_exercise.call_method_of_parent_class;

public class Main {
    public static void main(String[] args) {
         Parent parent = new Parent();
         Child child = new Child();

        //call method of parent class by object of parent class
        parent.parentPrint();

        //call method of child class by object of child class
        child.printChild();

        //call method of parent class by object of child class
        child.parentPrint();

    }


}
