package com.company;

/*
 * All Tigers are Cats but all Cats are not Tigers
 */
public class Tiger extends Cat {

    public Tiger()
    {
        super();
        System.out.println("I became a Tiger!");
    }

    @Override
    public String sleep() {
        return "A tiger sleeps...";
    }

    @Override
    public String eat() {
        return "A tiger eats...";
    }

    @Override
    public String drinkWater() {
        return "A tiger drinks water...";
    }

    public String growl(){
        return "A tiger growls...";
    }
}
