package com.pizza;

public class Margherita extends Pizza {
    public Margherita(Pizzeria pizzeria){
        super(pizzeria);
    }

    public String rezept(){
        String rezept = "Pizza Margehrita = ";
        rezept += this.pizzeria.teig();
        rezept += ", " + this.pizzeria.tomatenSosse();
        rezept += ", " + this.pizzeria.kaese();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzeria.teigPreis();
        preis += this.pizzeria.tomatenSossePreis();
        preis += this.pizzeria.kaesePreis();
        return preis;
    }
}
