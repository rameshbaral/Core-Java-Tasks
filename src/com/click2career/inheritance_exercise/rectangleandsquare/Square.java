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

public class Square extends Rectangle {
    private int side;

    public Square(int length, int breadth, int side) {
        super(length, breadth);
        this.side = side;
    }
    //prints the area of square
    @Override
    public void printArea() {
        System.out.printf("the area of square is %d%n", side*side);
    }
    //prints the perimeter of square


    @Override
    public void printPerimeter() {
        System.out.printf("The perimeter of square is %d%n", 4*side);
    }
}
