package com.pizza;

public class Pomodore extends Pizza {
    public Pomodore(Pizzaria pizzaria){
        this.pizzaria = pizzaria;
    }

    public String rezept(){
        String rezept = "Pizza Pomodore = ";
        rezept += this.pizzaria.teig();
        rezept += ", " + this.pizzaria.tomatenSosse();
        rezept += ", " + this.pizzaria.kaese();
        rezept += ", " + this.pizzaria.tomaten();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzaria.teigPreis();
        preis += this.pizzaria.tomatenSossePreis();
        preis += this.pizzaria.kaesePreis();
        preis += this.pizzaria.tomatenPreis();
        return preis;
    }
}