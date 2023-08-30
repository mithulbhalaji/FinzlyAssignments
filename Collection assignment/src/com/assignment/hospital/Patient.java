package com.assignment.hospital;

public class Patient {
    private String name;
    private String condition;
    private int age;
    private int id;

    public Patient(String name, String condition, int age,int id) {
        this.name = name;
        this.condition = condition;
        this.age = age;
        this.id =id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", condition='" + condition + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
