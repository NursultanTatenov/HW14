package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }
    public void dancing(){
        System.out.print(name+"was dancing in "+groupName+", and was ");
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

    @Override
    public String toString() {
        return "\nDancer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", groupName='" + groupName + '\'' +
                "}. \n";
    }
}
