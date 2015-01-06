package com.pizza;

public class Margherita extends Pizza {
    public Margherita(Pizzaria pizzaria){
        this.pizzaria = pizzaria;
    }

    public String rezept(){
        String rezept = "Pizza Margehrita = ";
        rezept += this.pizzaria.teig();
        rezept += ", " + this.pizzaria.tomatenSosse();
        rezept += ", " + this.pizzaria.kaese();
        return rezept;
    }

    public double preis(){
        double preis;
        preis = this.pizzaria.teigPreis();
        preis += this.pizzaria.tomatenSossePreis();
        preis += this.pizzaria.kaesePreis();
        return preis;
    }
}
