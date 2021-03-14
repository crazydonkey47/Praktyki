package com.company.zad3;
import java.util.Scanner;

public class Konto{
    double balance = 100.0;
    Scanner scanner = new Scanner(System.in);


    public void deposit(){
        System.out.print("Ile chcesz wplacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ){
            System.out.println("Probujesz wpłacić minusową liczbe pieniedzy");
        }
        else{
            this.balance += amount;
        }
    }
    public void withdraw(){
        System.out.print("Ile chcesz wyplacic?");
        double amount = scanner.nextDouble();
        if (amount < 0 ) {
            System.out.println("Probujesz wpylacic minusowa liczbe pieniedzy");
        }
        else {
            if (amount > this.balance) {
                System.out.println("Nie masz tylu srodkow na koncie");
            } else {
                this.balance -= amount;
            }
        }
    }
    public void info(){
        System.out.println("Twoj stan konta: "+ this.balance);
    }
}
