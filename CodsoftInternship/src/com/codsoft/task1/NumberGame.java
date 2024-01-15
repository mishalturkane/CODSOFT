package com.codsoft.task1;

import java.util.Random;

public class NumberGame {
    private int number;
    private int randomNumber;
    private int score;
    private final  int ATTEMPT=10;
    public int getScorer() {
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getRandomNumber(){
        Random random=new Random();
        this.randomNumber=random.nextInt(10);
        return randomNumber;
    }

    public int getATTEMPT() {
        return ATTEMPT;
    }
    @Override
    public String toString() {
        return "NumberGame{" +
                "number=" + number +
                ", RandomNumber=" + randomNumber +
                '}';
    }
}
