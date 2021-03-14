package com.company.klasy;

public class Vehicle {
    String vehicle;
    Engine engine;
    Size size;
    Color color;

    public Vehicle(String vehicle, Engine engine, Size size, Color color){
        this.vehicle = vehicle;
        this.engine = engine;
        this.size = size;
        this.color = color;
    }



    @Override
    public String toString(){
        return "Marka Auta "+ vehicle + "\nSilnik " + engine.engine + "\nDlugosc " + size.size + "\nKolor "+ color.color;
    }

}
