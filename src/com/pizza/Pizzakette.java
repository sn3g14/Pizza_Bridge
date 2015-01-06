package com.pizza;

public class Pizzakette {

    public static void main(String[] args) {
	    Pizzaria pizzaria1 = new Pizzaria1();
	    Pizzaria pizzaria2 = new Pizzaria2();

        Margherita margherita = new Margherita(pizzaria1);
        System.out.printf("%s | %1.2f€\n",
                margherita.rezept(),
                margherita.preis());

        margherita = new Margherita(pizzaria2);
        System.out.printf("%s | %1.2f€\n",
                margherita.rezept(),
                margherita.preis());
        System.out.println();
    }
}