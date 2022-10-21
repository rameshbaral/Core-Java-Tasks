package com.click2career.abstraction_exercise.marks_abstraction;

public class StudentA extends Marks {
    private Float marksInSub1, marksInSub2, marksInSub3;

    public StudentA(Float marksInSub1, Float marksInSub2, Float marksInSub3) {
        this.marksInSub1 = marksInSub1;
        this.marksInSub2 = marksInSub2;
        this.marksInSub3 = marksInSub3;
    }
    //returns the percentage in three subjects
    @Override
    Float getPercentage() {
        return ((marksInSub1 + marksInSub2 + marksInSub3)/300.0F)*100F;
    }
}
