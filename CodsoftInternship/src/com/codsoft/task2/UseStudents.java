package com.codsoft.task2;

import java.util.Scanner;

public class UseStudents {
    public static void main(String[] args) {
        Student st=new Student();
        Scanner kb=new Scanner(System.in);
        int totalSub=st.getTotalSub();
        System.out.println("Enter "+totalSub+" Subjects marks:");
        System.out.print("Enter English marks:");
        int eng=kb.nextInt();
        System.out.print("Enter Maths Marks:");
        int math=kb.nextInt();
        System.out.print("Enter Chemistry Marks:");
        int chem=kb.nextInt();
        System.out.print("Enter Physics Marks:");
        int phy=kb.nextInt();
        System.out.print("Enter Biology Marks:");
        int bio=kb.nextInt();
        st=new Student(eng,math,chem,phy,bio);
        st.sumMarks();
        st.avarageMarks();
        double sumOfMarks=st.getSumOfMarks();
        double avarageOfMarks=st.getAvarageOfMarks();
        System.out.println("Results:");
        System.out.println("Subtotal of marks:"+sumOfMarks);
        System.out.println("Avarage of marks:"+avarageOfMarks);
    }
}
