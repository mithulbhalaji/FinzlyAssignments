package com.assignment.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i=0;
        String name;
        int id;
        while(true){
            System.out.println("Enter 1 for adding employee \nEnter 2 for viewing employee\n" +
                    "Enter 3 for searching employees based on the ID\nEnter 4 to exit");
            i=sc.nextInt();
            sc.nextLine();
            if(i==1){
                System.out.println("Enter name: ");
                name = sc.nextLine();
                System.out.println("Enter salary: ");
                double salary = sc.nextDouble();
                employees.add(new Employee(name,salary));
            } else if (i==2) {
                for(Employee employee:employees){
                    System.out.println(employee);
                }
            } else if (i==3) {
                System.out.println("Enter your employee id");
                id=sc.nextInt();
                int size=0;
                for(Employee employee:employees){
                    if(employee.getEmployeeID()==id){
                        System.out.println(employee);
                        size++;
                    }
                }
                if(size<=0){
                    System.out.println("Employee not found");
                }
            }else if(i==4){
                System.out.println("Thank you");
                break;
            }else{
                System.out.println("Please enter a valid option");
            }

        }

    }
}
