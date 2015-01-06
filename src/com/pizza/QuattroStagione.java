package com.pizza;

public class QuattroStagione extends Pizza {
    public QuattroStagione(Pizzeria pizzeria){
        super(pizzeria);
    }

    public String rezept(){
        String rezept = "Pizza Quattro Stagione = ";
        rezept += this.pizzeria.teig();
        rezept += ", " + this.pizzeria.tomatenSosse();
        rezept += ", " + this.pizzeria.kaese();
        rezept += ", " + this.pizzeria.tomaten();
        rezept += ", " + this.pizzeria.paprika();
        rezept += ", " + this.pizzeria.schinken();
        rezept += ", " + this.pizzeria.salami();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzeria.teigPreis();
        preis += this.pizzeria.tomatenSossePreis();
        preis += this.pizzeria.kaesePreis();
        preis += this.pizzeria.tomatenPreis();
        preis += this.pizzeria.paprikaPreis();
        preis += this.pizzeria.schinkenPreis();
        preis += this.pizzeria.salamiPreis();
        return preis;
    }
}