package com.qa.PersonProject.entities;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Min(18)
    @Max(75)
    private int age;

    @NotNull
    @Size(min=2, max=30)
    private String firstname;

    @Size(min=2, max=30)
    private String lastname;

    public Person(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person() {
        this(18, "Unknown firstname", "Unknown lastname");
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
