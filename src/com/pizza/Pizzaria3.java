package com.pizza;

public class Pizzaria3 implements Pizzaria{

    @Override
    public String teig() {
        return "Teig: 210g";
    }

    @Override
    public double teigPreis() {
        return 0.75;
    }

    @Override
    public String tomatenSosse() {
        return "Tomaten Soße: 110ml";
    }

    @Override
    public double tomatenSossePreis() {
        return 0.30;
    }

    @Override
    public String tomaten() {
        return "Tomaten: 55g";
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
        return 0.40;
    }

    @Override
    public String salami() {
        return "Salami: 4 Scheiben";
    }

    @Override
    public double salamiPreis() {
        return 0.60;
    }

    @Override
    public String schinken() {
        return "Schinken: 2 Scheiben";
    }

    @Override
    public double schinkenPreis() {
        return 0.30;
    }

    @Override
    public String paprika() {
        return "Paprika: 45g";
    }

    @Override
    public double paprikaPreis() {
        return 0.35;
    }

    @Override
    public String sardellen() {
        return "Sardellen: 9 Stück";
    }

    @Override
    public double sardellenPreis() {
        return 2.10;
    }
}

