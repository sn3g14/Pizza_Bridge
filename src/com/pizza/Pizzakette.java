package com.pizza;

public class Pizzakette {

    public static void main(String[] args) {
	    Pizzeria pizzeria1 = new Pizzeria1();
	    Pizzeria pizzeria2 = new Pizzeria2();

        Margherita margherita = new Margherita(pizzeria1);
        System.out.printf("%s | %1.2f€\n",
                margherita.rezept(),
                margherita.preis());

        margherita = new Margherita(pizzeria2);
        System.out.printf("%s | %1.2f€\n",
                margherita.rezept(),
                margherita.preis());
        System.out.println();
    }
}