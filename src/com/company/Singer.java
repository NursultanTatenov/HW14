package com.company;

public class Singer extends Person{

    private String bandName;


    public Singer (String name, String designation,String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing (){
        System.out.print("Singer is sing a song, ");
    }
    public void playGitar() {
        System.out.print("play guitar ");
    }

    @Override
    void learn() {
        System.out.print("and like other persons learning, ");
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
        return "\nSinger{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                "}. \n";
    }
}
