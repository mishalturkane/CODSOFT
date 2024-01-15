package com.codsoft.task3;

import java.util.Scanner;

public class Atm {
    private final int  PIN=6265;
    private double balance=0;
    Scanner kb=new Scanner(System.in);

    public void checkPin(){
        System.out.println("Enter a PIN:");
        int pin=kb.nextInt();

        if(pin==PIN){
            System.out.println("Your Welcome!");
            menu();
        }else {
            System.out.println("Invalid PIN try again:");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("Select a choice");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        int choice=kb.nextInt();
        switch (choice){
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                System.out.println("Please visit again!");
                System.exit(0);
            default:
                System.out.println("Invalid choice please select again");
                menu();
        }
    }
    public void checkBalance(){
        System.out.println("your balance is:"+balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter a amount:");
        double amount=kb.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient balance");
            menu();
        }else {
            balance=balance-amount;
            System.out.println("Money withdraw successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter a amount:");
        double amount=kb.nextDouble();
        balance=balance+amount;
        System.out.println("Money deposit successfully");
        menu();
    }

}
