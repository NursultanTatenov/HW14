package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void learn(){
        System.out.print("learning, ");
    }

    void walk(){
        System.out.print("walking, ");
    }

    void eat (){
        System.out.print("eating. ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    }
