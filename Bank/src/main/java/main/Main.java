package main;

import bank.BankAccount;

public class Main {
    public static void main(String [] args){
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(14447222);
        account1.setAccountOwner("James P. Jackson");
        account1.setBalance(108252200);

        String formattedBalance = String.format("%,.2f", account1.getBalance());

        System.out.println("Bank Account Details:");
        System.out.println("Account Holder: " + account1.getAccountOwner());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: $" + formattedBalance);
    }
}
