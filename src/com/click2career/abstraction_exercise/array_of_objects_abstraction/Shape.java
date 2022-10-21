/*
7. Repeat the above question for 4 rectangles, 4 squares and 5 circles.
Hint- Use an array of objects.

 */
package com.click2career.abstraction_exercise.array_of_objects_abstraction;

abstract class Shape {
    abstract void rectangleArea(Integer length, Integer breadth);
    abstract void squareArea(Integer length);
    abstract void circleArea(Integer radius);

}
