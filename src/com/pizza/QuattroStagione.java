package com.pizza;

public class QuattroStagione extends Pizza {
    public QuattroStagione(Pizzaria pizzaria){
        this.pizzaria = pizzaria;
    }

    public String rezept(){
        String rezept = "Pizza Quattro Stagione = ";
        rezept += this.pizzaria.teig();
        rezept += ", " + this.pizzaria.tomatenSosse();
        rezept += ", " + this.pizzaria.kaese();
        rezept += ", " + this.pizzaria.tomaten();
        rezept += ", " + this.pizzaria.paprika();
        rezept += ", " + this.pizzaria.schinken();
        rezept += ", " + this.pizzaria.salami();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzaria.teigPreis();
        preis += this.pizzaria.tomatenSossePreis();
        preis += this.pizzaria.kaesePreis();
        preis += this.pizzaria.tomatenPreis();
        preis += this.pizzaria.paprikaPreis();
        preis += this.pizzaria.schinkenPreis();
        preis += this.pizzaria.salamiPreis();
        return preis;
    }
}