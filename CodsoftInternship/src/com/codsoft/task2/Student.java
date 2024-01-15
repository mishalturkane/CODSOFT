package com.codsoft.task2;

public class Student {
    private final int totalSub =5;
    private int sumOfMarks;
    private double avarageOfMarks;
    private  int englishMarks;
    private int mathMaks;
    private int chemestryMarks;
    private int physicsMarks;
    private int biologyMarks;
    public  Student(){
    }

    public Student(int englishMarks, int mathMaks, int chemestryMarks, int physicsMarks, int biologyMarks) {
        this.englishMarks = englishMarks;
        this.mathMaks = mathMaks;
        this.chemestryMarks = chemestryMarks;
        this.physicsMarks = physicsMarks;
        this.biologyMarks = biologyMarks;
    }
    public void sumMarks(){
       sumOfMarks=englishMarks+mathMaks+chemestryMarks+physicsMarks+biologyMarks;
    }
    public void avarageMarks(){
       avarageOfMarks=(double) sumOfMarks/ totalSub;
    }

    public int getTotalSub() {
        return totalSub;
    }

    public int getSumOfMarks() {
        return sumOfMarks;
    }

    public double getAvarageOfMarks() {
        return avarageOfMarks;
    }
}
