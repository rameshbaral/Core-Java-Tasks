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

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    //prints the area of the rectangle
    public void printArea(){
        System.out.printf("area of rectangle is %d%n ",(length*breadth));
    }
    //prints the perimeter of the rectangle
    public void printPerimeter(){
        System.out.printf("perimeter of the rectangle is %d%n",(2*(length+breadth)));
    }
}
