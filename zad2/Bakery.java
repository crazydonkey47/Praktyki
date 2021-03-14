package com.company.z2;

public class Bakery extends Shop{
    private String[] products = {"Hotdog", "Nuggetsy", "Big essa", "kanapka z serem"};

    Bakery(String address, String size) {
        super(address, size);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Nasze wypieki:");
        for (String i : products){
            System.out.println(i);
        }
    }
}
