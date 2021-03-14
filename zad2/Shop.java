package com.company.zad2;

public class Shop {
    protected String address;
    protected String size;

    Shop(String address, String size){
        this.address = address;
        this.size = size;
    }

    public void get_info(){
        System.out.println("Sklep znajduje się pod adresem "+ address + " i jest "+ size + " wielkości");
    }
}
