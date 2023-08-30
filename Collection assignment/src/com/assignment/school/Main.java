package com.assignment.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        while(true){
            System.out.println("Select a option\n| 1 To add teachers\n| 2 To add students" +
                    "\n| 3 To view all teachers\n| 4 To view all students\n" +
                    "| 5 To exit");
            option=sc.nextInt();
            sc.nextLine();
            if(option==1){
                System.out.println("Teacher input");
                teachers.add(new Teacher(stringInput(sc,"Enter name"),
                        intInput(sc,"Enter age"),stringInput(sc,"Enter subject")));
                System.out.println("Teacher added successfully");
            } else if (option==2) {
                System.out.println("Student input");
                students.add(new Student(stringInput(sc,"Enter name"),intInput(sc,"Enter age")
                ,intInput(sc,"Enter grade")));
                System.out.println("Student added successfully");
            } else if (option == 3) {
                System.out.println("Teachers: ");
                for(Teacher teacher:teachers){
                    System.out.println(teacher);
                }
            } else if (option==4) {
                System.out.println("Students: ");
                for(Student student : students){
                    System.out.println(student);
                }
            } else if (option==5) {
                System.out.println("Thank you");
                break;
            }

        }
    }

    private static String stringInput(Scanner sc,String s){
        System.out.println(s);
        String name = sc.nextLine();
        return name;
    }
    private static int intInput(Scanner sc,String s){
        System.out.println(s);
        int age = sc.nextInt();
        sc.nextLine();
        return age;
    }
}
