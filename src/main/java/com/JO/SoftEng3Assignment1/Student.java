package com.JO.SoftEng3Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Student {

    //"Andrew", 19, "14/12/1998", 14415987
    String name;
    Integer age;
    String dob;
    String id;
    String username;

    public Student(String name, Integer age, String dob, String id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = generateUsername(name, age);
    }

    public String generateUsername(String name, Integer age){
        return name + String.valueOf(age);
    }

    public String getName(){return name;}

    public String getDob(){return dob;}

    public String getId(){return id;}

    public Integer getAge(){return age;}

}
