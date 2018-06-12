package com.company;

/*
 * All Elephants are Animals but all Animals are not Elephants
 */
public class Elephant extends Animal {

    public Elephant()
    {
        super();
        System.out.println("Now I am an Elephant!");
    }

    @Override
    public String sleep() {
        return "An elephant sleeps...";
    }

    @Override
    public String eat() {
        return "An elephant eats...";
    }

    @Override
    public String drinkWater() {
        return "An elephant drinks water...";
    }

    public String trumpet(){
        return "An elephant trumpets...";
    }
}
