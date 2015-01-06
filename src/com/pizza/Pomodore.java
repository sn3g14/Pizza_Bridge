package com.pizza;

public class Pomodore extends Pizza {
    public Pomodore(Pizzeria pizzeria){
        super(pizzeria);
    }

    public String rezept(){
        String rezept = "Pizza Pomodore = ";
        rezept += this.pizzeria.teig();
        rezept += ", " + this.pizzeria.tomatenSosse();
        rezept += ", " + this.pizzeria.kaese();
        rezept += ", " + this.pizzeria.tomaten();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzeria.teigPreis();
        preis += this.pizzeria.tomatenSossePreis();
        preis += this.pizzeria.kaesePreis();
        preis += this.pizzeria.tomatenPreis();
        return preis;
    }
}