package com.pizza;

public class Pizzeria2 implements Pizzeria {

    @Override
    public String teig() {
        return "Teig: 190g";
    }

    @Override
    public double teigPreis() {
        return 0.40;
    }

    @Override
    public String tomatenSosse() {
        return "Tomaten Soße: 110ml";
    }

    @Override
    public double tomatenSossePreis() {
        return 0.25;
    }

    @Override
    public String tomaten() {
        return "Tomaten: 60g";
    }

    @Override
    public double tomatenPreis() {
        return 0.30;
    }

    @Override
    public String kaese() {
        return "Kaese: 60g";
    }

    @Override
    public double kaesePreis() {
        return 0.70;
    }

    @Override
    public String salami() {
        return "Salami: 4 Scheiben";
    }

    @Override
    public double salamiPreis() {
        return 0.40;
    }

    @Override
    public String schinken() {
        return "Schinken: 3 Scheiben";
    }

    @Override
    public double schinkenPreis() {
        return 0.25;
    }

    @Override
    public String paprika() {
        return "Paprika: 45g";
    }

    @Override
    public double paprikaPreis() {
        return 0.25;
    }

    @Override
    public String sardellen() {
        return "Sardellen: 8 Stück";
    }

    @Override
    public double sardellenPreis() {
        return 1.90;
    }
}

