package com.example.user_service.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String username;
    private String password;

    public MyUser() {
    }

    //parameterized constructor
    public MyUser(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //setters and getters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
