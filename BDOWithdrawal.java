package com.mycompany.bdowithdrawal;

import java.util.Scanner;

public class BDOWithdrawal {
    
    
    public static void main(String[] args) {
        // BDO ATM :))
        
        //frame consructor
        frame f = new frame();
        
        // I just include the input for the spice:)
        Scanner scan = new Scanner(System.in);
        
        
        // deposit or withdrawal decision
        System.out.println("Deposit or Withdraw");
        String decision = scan.nextLine();
        
        switch (decision) {
            case "Deposit":
                {
                    System.out.println("Input the amount you want to Deposit");
                    double amount = scan.nextDouble();
                    f.currentBal += amount;
                    f.updateReceipt();
                    System.out.println("Do you want a reciept? y/n");
                    String recieptInput = scan.next();
                        switch (recieptInput){
                            case "y":
                                f.Frame();
                                break;
                            case "n":
                                break;
                        }
                    break;
                }
            case "Withdraw":
                {
                    System.out.println("Input the amount you want to Withdraw \nThe only supported Amount were: \n200\n500\n1000");
                    double amount = scan.nextDouble();
                    
                       if(amount < 200 || (amount > 500 && amount < 1000) || amount > 1000) {
                            System.out.println("error");
                            break;
                        }
                       if (amount == 200 || amount == 500 || amount == 1000) {
                           f.currentBal -= amount;
                           f.updateReceipt();
                           System.out.println("Do you want a reciept? y/n");
                           String recieptInput = scan.next();
                           switch (recieptInput){
                            case "y":
                                f.Frame();
                                break;
                            case "n":
                                break;
                            }
                       }
                       break;
                }
            default:
                System.out.println("error");
                break;
        }
        
        
        
    }
     
    
}
