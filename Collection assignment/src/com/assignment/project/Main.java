package com.assignment.project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static HashMap<String,Team> projects = new HashMap<>();

    public static void main(String[] args) {
        int option ;
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Enter a option:\n| 1 Add projects" +"\n| 2 For project details"+
                    "\n| 3 Display all the projects\n| 4 exit");
            option = sc.nextInt();
            sc.nextLine();
            if(option==1){
                String projectName = getStringInput(sc,"Enter project name");
                if(projects.containsKey(projectName)){
                    System.out.println("The project already exists");
                }else{
                    projects.put(projectName,new Team(getListOfTeam(sc),
                            getStringInput(sc,"Enter project details")));
                }
            } else if (option==2) {
                String projectName = getStringInput(sc,"Enter project name");
                if(projects.containsKey(projectName)){
                    System.out.println(projects.get(projectName).getProjectDetails());
                }else{
                    System.out.println("Project not found");
                }
            } else if (option==3) {
                for(String t:projects.keySet()){
                    System.out.println(projects.get(t));
                }
            } else if (option==4) {
                break;
            }else {
                System.out.println("Enter a valid option");
            }
        }
    }

    private  static String getStringInput(Scanner sc, String s){
        System.out.println(s);
        return sc.nextLine();
    }
    private static HashSet<String> getListOfTeam(Scanner sc){
        System.out.println("Enter the number of team members");
        HashSet<String> teamMemberNames = new HashSet<>();
        int size = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<size;i++){
            teamMemberNames.add(getStringInput(sc,"Enter name"));
        }
        return teamMemberNames;
    }

}
