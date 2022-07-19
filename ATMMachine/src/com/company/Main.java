package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OperationInterface op = new Operations();
        int atmnumber = 12346;
        int atmpin = 1234;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber = in.nextInt();
        System.out.print("Enter Pin: ");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                switch (ch) {
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter Amount to Deposit :");
                        double depositAmount = in.nextDouble();//5000
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter correct choice\n");
                }
            }
        } else {
            System.out.println("Incorrect Atm Number or pin\n");
            System.exit(0);
        }
    }
}
