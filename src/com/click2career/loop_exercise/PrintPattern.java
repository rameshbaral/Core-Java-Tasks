/*
20. Write a program to print following :
**********
**********
**********
**********
*
**
***
****
*****
*
**
***
****
*****
*
***
*****
*******
*********
1
212
32123
4321234
543212345

 */
package com.click2career.loop_exercise;

public class PrintPattern {
    public static void main(String[] args) {
        //prints first pattern of the question using nested for loop
        for(int i=0;i<4;i++){
            //for rows
            for(int j=0;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //prints second pattern of the question
        //for columns
        for(int i=0;i<5;i++){
            //for rows
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //prints third pattern of the question using 3 nested for loop
        //for columns
        for(int i=0;i<5;i++){
            //for spaces before rows
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            //for rows
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //prints fourth pattern of the question using 3 for loops
        //for columns
        for(int i=1;i<=9;i=(i+2)){
            //for rows
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //prints fifth pattern of the question
        int x=1;
        //for columns
        for(int i=1;i<=9;i=(i+2)){
            //for rows
            for(int j=1;j<=i;j++){
                System.out.print(x);
            }
            x++;
            System.out.println();
        }

        System.out.println();


        //prints sixth pattern of the question
        int y=1,m=1;
        //for columns
        for(int i=1;i<=9;i=(i+2)){
            //for first half of a row
            for(int j=m;j>1;j--){
                System.out.print(j);
            }
            //for second half of a row
            for(int k=1;k<=m;k++){
                System.out.print(y);
                y++;
            }
            m++;
            y=1;
            System.out.println();
        }

    }
}
