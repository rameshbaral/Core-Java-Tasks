/*
5. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now
create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class
'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class
'Animals'. Now create an object for each of the subclasses and call their respective
methods
 */
package com.click2career.abstraction_exercise.abstraction_animal;

abstract class Animals {
    abstract void cats();
    abstract void dogs();
}
