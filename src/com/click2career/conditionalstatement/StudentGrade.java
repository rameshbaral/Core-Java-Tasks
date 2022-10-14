package com.click2career.conditionalstatement;

import java.util.Scanner;

public class StudentGrade {
    final static float MIN_MARKS = 0;
    final static float MAX_MARKS = 100;
    final static float TOTAL_MARKS = 500;

    public static void main(String[] args) {
        float marksInEnglish = readMarks("enter marks in english ");
        float marksInMath = readMarks("enter marks in maths");
        float marksInScience = readMarks("enter marks in science");
        float marksInBiology = readMarks("enter marks in biology");
        float marksInChemistry = readMarks("enter marks in chemistry");
        float totalMarks = marksInBiology+ marksInChemistry + marksInEnglish + marksInScience+ marksInMath;
        String grade = calculateGrade(marksInBiology, marksInChemistry, marksInEnglish,marksInScience, marksInMath);
        System.out.println("Total marks obtained by student is "+ totalMarks + " And the grade obtained is " + grade);

    }

    public static float readMarks(String prompt){
        Scanner sc = new Scanner(System.in);
        float marks;
        while (true) {
            System.out.println(prompt);
            marks = sc.nextFloat();
            if (marks>MIN_MARKS && marks <= MAX_MARKS)
                break;
            System.out.println("enter value between " + MIN_MARKS + " and "+ MAX_MARKS);
        }
        return marks;
    }
    public static String calculateGrade(float sub1, float sub2, float sub3, float sub4, float sub5){
        float totalMarksObtained = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (totalMarksObtained/TOTAL_MARKS)*100;
        if(percentage<100 && percentage>=90)
            return "A";
        else if(percentage<90 && percentage>=80)
            return "A-";
        else if(percentage<80 && percentage>=70)
            return "B+";
        else if(percentage<70 && percentage>=60)
            return "B";
        else if(percentage<60 && percentage>=50)
            return "C";
        else if(percentage<50 && percentage>=40)
            return "D";
        else
            return "F";
    }
}
