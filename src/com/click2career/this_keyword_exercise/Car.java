/*
1) this: to refer current class instance variable
 */
package com.click2career.this_keyword_exercise;

public class Car {
    int numberOfGears;
    int topSpeed;
    String carType;

    public Car(int numberOfGears, int topSpeed, String carType) {
        this.numberOfGears = numberOfGears;//refers o current class instance variable
        this.topSpeed = topSpeed;//refers o current class instance variable
        this.carType = carType;//refers o current class instance variable
    }
    public void display(){
        System.out.println("number of gears in car: "+ numberOfGears + " Top car speed is: "+ topSpeed + " And the Type is "+ carType);
    }

    public static void main(String[] args) {
        Car car = new Car(6, 360, "racing");
        car.display();
    }
}
