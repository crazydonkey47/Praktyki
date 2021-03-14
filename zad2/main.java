package com.company.zad2;

public class main {
    public static void main(String[] args) {
        Shop sklep = new Shop("Kolorowa 420", "duzy");
        sklep.get_info();

        Bookshop ksiegarnia = new Bookshop("Mickiewicza 8", "sredni");
        ksiegarnia.get_info();

        Bakery piekarnia = new Bakery("Nigera 19", "maly");
        piekarnia.get_info();

    }
}
