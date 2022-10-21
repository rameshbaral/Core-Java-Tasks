package com.click2career.abstraction_exercise.marks_abstraction;

public class StudentB extends Marks{
    private Float marksInSub1, marksInSub2, marksInSub3, marksInSub4;

    public StudentB(Float marksInSub1, Float marksInSub2, Float marksInSub3, Float marksInSub4) {
        this.marksInSub1 = marksInSub1;
        this.marksInSub2 = marksInSub2;
        this.marksInSub3 = marksInSub3;
        this.marksInSub4 = marksInSub4;
    }

    @Override
    Float getPercentage() {
        return ((marksInSub1 + marksInSub2 + marksInSub3 + marksInSub4)/400.0F)*100F;
    }
}
