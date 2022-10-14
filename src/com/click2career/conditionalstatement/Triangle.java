/*
c. WAP to check whether a triangle can be formed by the given value for the
angles.[Sum of the angles in a triangle should be 180 ]
1. Test Data :
2. 40 55 65
3. Expected Output :
4. The triangle is not valid.
 */

package com.click2career.conditionalstatement;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstAngle;
        float secondAngle;
        float thirdAngle;

        //takes the input from user about angles of triangle
        System.out.println("enter the first angle of triangle");
        firstAngle = sc.nextFloat();
        System.out.println("enter the second angle of triangle");
        secondAngle = sc.nextFloat();
        System.out.println("enter the third angle of triangle");
        thirdAngle = sc.nextFloat();

        //checks if it is possible to form triangle
        if (firstAngle+secondAngle+thirdAngle == 180)
            System.out.println("It is possible to form triangle");
        else
            System.out.println("The triangle is not valid.\n");


    }
}
