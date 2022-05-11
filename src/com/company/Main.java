package com.company;

public class Main {

    public static void main(String[] args) {

      Programmer programmer = new Programmer("Bill Gates","Co-founder","Microsoft");
        System.out.print(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();

      Singer singer=new Singer("Paul McCartney","Singer","Beatles");
        System.out.print(singer);
        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.walk();
        singer.eat();

      Dancer dancer=new Dancer("Bubusara Beyshenalieva","Ballerina","Kyrgyz Opera and Ballet Theater");
      System.out.print(dancer);
      dancer.dancing();
      dancer.learn();
      dancer.walk();
      dancer.eat();
    }
}
