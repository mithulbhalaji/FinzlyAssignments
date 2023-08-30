package com.assignment.bank;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    private static List<Account> accounts = new Vector<>();
    public static void main(String[] args) {
        int option ;
        while (true){
            System.out.println("Enter your option\n| 1 To create account\n| 2 To use existing account" +
                    "\n| 3 To list all the accounts\n| 4 To exit");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();
            if(option==1){
                Account account = new Account(getStringInput(sc,"Enter your name"));
                accounts.add(account);
                System.out.println("Your account number is "+account.getAccountNumber());
            } else if (option==2) {
                Account account = getAccount(getStringInput(sc,"Enter your account number : "));
                if(account!=null){
                    while(true){
                        System.out.println("Enter your option\n| 1 To check balance\n| 2 To Deposit" +
                                "\n| 3 To withdraw\n| 4 Exit");
                        option= sc.nextInt();
                        sc.nextLine();
                        if(option==1){
                            System.out.println(account.getBalance());
                        } else if (option==2) {
                            account.deposit(getDoubleInput(sc,"Enter your amount"));
                        } else if (option==3) {
                            account.withDraw(getDoubleInput(sc,"Enter your amount"));
                        } else if (option==4) {
                            break;
                        }else{
                            System.out.println("Enter a valid option");
                        }
                    }

                }else{
                    System.out.println("Not a existing account");
                }
            }else if(option==3){
                for(Account account: accounts){
                    System.out.println(account);
                }
            }else if(option==4){
                break;
            }else{
                System.out.println("Enter a valid option");
            }
        }
    }
    public static Account getAccount(String accountNumber){
       for(Account account: accounts){
           if(account.getAccountNumber().equals(accountNumber)){
               return account;
           }
        }
       return null;
    }
    public static String getStringInput(Scanner sc, String s){
        System.out.println(s);
        return sc.nextLine();
    }
    public static double getDoubleInput(Scanner sc, String s) {
        System.out.println(s);
        double d = sc.nextDouble();
        sc.nextLine();
        return d;
    }
}
