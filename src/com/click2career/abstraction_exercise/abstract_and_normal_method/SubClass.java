/*
4. An abstract class has a constructor which prints "This is constructor of abstract
class", an abstract method named 'a_method' and a non-abstract method which
prints "This is a normal method of abstract class". A class 'SubClass' inherits the
abstract class and has a method named 'a_method' which prints "This is abstract
method". Now create an object of 'SubClass' and call the abstract method and the
non-abstract method. (Analyse the result)

 */
package com.click2career.abstraction_exercise.abstract_and_normal_method;

public class SubClass extends AbstractExample{
    //implementation of abstract method "a_method" in subclass of AbstractExample
    @Override
    void a_method() {
        System.out.println("This is a abstract method");
    }
}
