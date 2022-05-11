package com.company;

public class Programmer extends Person {

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    void coding() {
        System.out.print("Programmer is coding, ");
    }

    @Override
    void learn() {
        super.learn();
    }

    @Override
    void walk() {
        super.walk();
    }

    @Override
    void eat() {
        super.eat();
    }


    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                "}. \n";
    }
}

