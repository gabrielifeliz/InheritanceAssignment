package com.company;

/* Create the following Application in IntelliJ.
* Then create classes for Animal, Bird, Cat, Tiger, Dog and Elephant. */

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.drinkWater();
        System.out.println();

        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.drinkWater();
        c.purr();
        System.out.println();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.drinkWater();
        b.fly();
        System.out.println();

        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.drinkWater();
        d.bark();
        System.out.println();

        Elephant e = new Elephant();
        e.eat();
        e.sleep();
        e.drinkWater();
        e.trumpet();
        System.out.println();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.drinkWater();
        t.growl();
        System.out.println();
    }
}

