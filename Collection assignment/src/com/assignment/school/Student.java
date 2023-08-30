package com.assignment.school;

public class Student extends Person{
    private int studentID;
    private int studentGrade;
    private static int tempID=1;

    public Student(String name, int age,int grade) {
        super(name, age);
        this.studentID = tempID;
        this.studentGrade =grade;
        tempID++;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public static int getTempID() {
        return tempID;
    }

    public static void setTempID(int tempID) {
        Student.tempID = tempID;
    }

    @Override
    public String toString() {
        return "Student{" +"studentName="+super.getName()+" studentAge"+super.getAge()+
                " studentID=" + studentID +" studentGrade"+ studentGrade +
                '}';
    }
}
