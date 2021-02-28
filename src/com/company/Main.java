package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Type(saving/current)");
        String accountType = sc.next();
        System.out.println("Enter the Account Number");
        String accountNo = sc.next();
        System.out.println("Enter the Account Name");
        String accountName = sc.next();
        System.out.println("Enter the No of years:");
        int years = sc.nextInt();
        System.out.println("Enter the balance:");
        double balance = sc.nextDouble();
        //System.out.println(determineAccountType(accountType));

        if(accountType.equals("saving")){
            Account acc = new SavingsAccount();
            acc.setAccountName(accountName);
            acc.setAccountNo(accountNo);
            acc.setAccountType(accountType);
            acc.setBalance(balance);
            acc.setNoOfYears(years);
            System.out.println("The interest for "+acc.getAccountName()+" of Account Type "+accountType+ " is "+acc.calculateInterest());
        }
        else if(accountType.equals("current")){
            System.out.println("Enter the number of Transaction:");
            int tran = sc.nextInt();
            Account acc = new CurrentAccount();
            ((CurrentAccount)acc).setNoOfTransactionPerMonth(tran);
            acc.setAccountName(accountName);
            acc.setAccountNo(accountNo);
            acc.setAccountType(accountType);
            acc.setBalance(balance);
            acc.setNoOfYears(years);
            System.out.println("The interest for "+acc.getAccountName()+" of Account Type "+accountType+ " is "+acc.calculateInterest());
        }
    }
    public static String determineAccountType(String accountType){
        return accountType;
    }
}
