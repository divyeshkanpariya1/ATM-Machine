package com.company;

import java.util.HashMap;
import java.util.Map;

public class Operations implements OperationInterface{
    ATM atm=new ATM();
    Map<Double,String> miniStmt=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance()+"\n");

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%100==0) {
            if (withdrawAmount <= atm.getBalance()) {
                miniStmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!\n");
            }
        }
        else {
            System.out.println("Please enter the amount in multiple of 100\n");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        if(depositAmount%100 == 0){
            miniStmt.put(depositAmount," Amount Deposited");
            System.out.println(depositAmount+" Deposited Successfully !!");
            atm.setBalance(atm.getBalance()+depositAmount);
            viewBalance();
        }else{
            System.out.println("Please Deposit the amount in multiple of 100\n");
        }


    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:miniStmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue()+"\n");
        }

    }
}
