package com.assignment.school;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +"teacher name="+super.getName()+" teacherAge="+super.getAge()+
                " subject='" + subject + '\'' +
                '}';
    }
}
