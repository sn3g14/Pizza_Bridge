package com.pizza;

public class Napoli extends Pizza {
    public Napoli(Pizzaria pizzaria){
        this.pizzaria = pizzaria;
    }

    public String rezept(){
        String rezept = "Pizza Napoli = ";
        rezept += this.pizzaria.teig();
        rezept += ", " + this.pizzaria.tomatenSosse();
        rezept += ", " + this.pizzaria.kaese();
        rezept += ", " + this.pizzaria.sardellen();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzaria.teigPreis();
        preis += this.pizzaria.tomatenSossePreis();
        preis += this.pizzaria.kaesePreis();
        preis += this.pizzaria.sardellenPreis();
        return preis;
    }
}