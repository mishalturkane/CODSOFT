package com.codsoft.task1;

import java.util.Scanner;

public class UseNumberGame {
    public static void main(String[] args) {
        NumberGame nm=new NumberGame();
        Scanner kb=new Scanner(System.in);
        int score=nm.getScorer();
        int attemps=nm.getATTEMPT();
        int randomNuber;
        while(attemps>0){
            System.out.println("++++++++++Total Attempts:" + attemps + "++++++++++");
            System.out.print("Enter number in range 1 to 10:");
            int n=kb.nextInt();
            nm.setNumber(n);
            randomNuber=nm.getRandomNumber();
            if(n==randomNuber){
                System.out.println("Correct number:"+n);
                score++;
                System.out.println("Score:"+score);
                attemps--;
                 }
             else {
                System.out.println("Wrong number! Random Number is:"+randomNuber);
                System.out.println("Score:"+score);
                attemps--;
            }
            System.out.println();
        }
        System.out.println("Attemps end!!!!");
        System.out.println("Your Score is:"+score);
    }
}
