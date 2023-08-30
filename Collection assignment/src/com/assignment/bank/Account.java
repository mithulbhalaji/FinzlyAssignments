package com.assignment.bank;

public class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    private static int id=1;

    public Account(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = "BNK000"+id;
        this.balance = 1000;
        id++;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double amount){
        if(amount<=0){
            System.out.println("Invalid amount entered");
        }else if(amount>=balance){
            System.out.println("Insufficient Balance");
        }else{
            balance-=amount;
        }
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid amount entered");
        }else{
            balance+=amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
