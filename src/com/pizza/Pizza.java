package com.pizza;

public abstract class Pizza {
    protected Pizzeria pizzeria;

    public Pizza(Pizzeria pizzeria){
        if(pizzeria != null)
            this.pizzeria = pizzeria;
    }

    public abstract String rezept();
    public abstract double preis();
}