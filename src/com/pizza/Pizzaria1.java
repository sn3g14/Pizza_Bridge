package com.pizza;

public class Pizzaria1 implements Pizzaria{

    @Override
    public String teig() {
        return "Teig: 200g";
    }

    @Override
    public double teigPreis() {
        return 0.50;
    }

    @Override
    public String tomatenSosse() {
        return "Tomaten Soße: 100ml";
    }

    @Override
    public double tomatenSossePreis() {
        return 0.20;
    }

    @Override
    public String tomaten() {
        return "Tomaten: 50g";
    }

    @Override
    public double tomatenPreis() {
        return 0.30;
    }

    @Override
    public String kaese() {
        return "Kaese: 50g";
    }

    @Override
    public double kaesePreis() {
        return 0.50;
    }

    @Override
    public String salami() {
        return "Salami: 5 Scheiben";
    }

    @Override
    public double salamiPreis() {
        return 0.35;
    }

    @Override
    public String schinken() {
        return "Schinken: 2 Scheiben";
    }

    @Override
    public double schinkenPreis() {
        return 0.20;
    }

    @Override
    public String paprika() {
        return "Paprika: 40g";
    }

    @Override
    public double paprikaPreis() {
        return 0.20;
    }

    @Override
    public String sardellen() {
        return "Sardellen: 10 Stück";
    }

    @Override
    public double sardellenPreis() {
        return 2.00;
    }
}
