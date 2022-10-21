/*
2. Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with
its constructor having a parameter for its side (suppose s) calling the constructor
of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and
a square.
 */
package com.click2career.inheritance_exercise.rectangleandsquare;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,12);
        Square square = new Square(12,14,10);
        rectangle.printArea();;
        rectangle.printArea();
        square.printArea();
        square.printPerimeter();
    }
}
