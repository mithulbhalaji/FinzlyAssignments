package com.assignment.hospital;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer,Patient> patients = new HashMap<>();
    static int id = 1;

    public static void main(String[] args) {
        int option;
        Scanner sc= new Scanner(System.in);

        while (true){
            System.out.println("Enter your option\n| 1 To add patients\n" +
                    "| 2 To search patients\n| 3 To show all the patients\n| 4 To exit");
            option= sc.nextInt();
            sc.nextLine();
            if(option==1){
                patients.put(id,new Patient(getStringInput(sc,"Enter your name"),
                        getStringInput(sc,"Enter your condition"),
                        getIntInput(sc,"Enter your age"),id));
                System.out.println("Patient added successfully and patient id is "+id);
                id++;
            }else if(option==2){
                int id= getIntInput(sc,"Enter your id");
                if(patients.containsKey(id)){
                    System.out.println(patients.get(id));
                }else{
                    System.out.println("Patient is not found");
                }
            } else if (option==3) {
                for(Integer p: patients.keySet()){
                    System.out.println(patients.get(p));
                }
            } else if (option==4) {
                System.out.println("Thank you");
                break;
            }else {
                System.out.println("Enter a valid option");
            }
        }
    }

    private static String getStringInput(Scanner sc,String s){
        System.out.println(s);
        return sc.nextLine();
    }
    private static int getIntInput(Scanner sc,String s){
        System.out.println(s);
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }
}
