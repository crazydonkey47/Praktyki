package com.company.klasy;

public class main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle("BMW", new Engine("mega szybki dobry"), new Size(7), new Color("Czerwony tez szybki"));
        System.out.println(veh);
    }
}
