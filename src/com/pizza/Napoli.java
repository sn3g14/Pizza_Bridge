package com.pizza;

public class Napoli extends Pizza {
    public Napoli(Pizzeria pizzeria){
        super(pizzeria);
    }

    public String rezept(){
        String rezept = "Pizza Napoli = ";
        rezept += this.pizzeria.teig();
        rezept += ", " + this.pizzeria.tomatenSosse();
        rezept += ", " + this.pizzeria.kaese();
        rezept += ", " + this.pizzeria.sardellen();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzeria.teigPreis();
        preis += this.pizzeria.tomatenSossePreis();
        preis += this.pizzeria.kaesePreis();
        preis += this.pizzeria.sardellenPreis();
        return preis;
    }
}