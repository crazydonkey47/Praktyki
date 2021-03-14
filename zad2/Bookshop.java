package com.company.zad2;

public class Bookshop extends Shop{
    private String[] products = {"Minecraft poradnik", "Czemu nie warto grac w lola", "ZSE to najgorsza szkola", "Czemu oni po prostu nie pickna fizza"};

    Bookshop(String address, String size) {
        super(address, size);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Nasze ksiazki:");
        for (String i : products){
            System.out.println(i);
        }
    }
}
