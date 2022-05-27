package com.example.greetingapp1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    public int id;

    public int getId() {
        return id;
    }

    private String firstName;

    public void setId(int id) {
        this.id = id;
    }

    private String lastName;



    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName=firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
