package com.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="login")
public class UserLogin {
    private int id;
    private String email;
    private String name;
    UserLogin(){}
    public UserLogin(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
        System.out.println("Object");
    }
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

