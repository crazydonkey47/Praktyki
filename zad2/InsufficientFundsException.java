package com.company.zad2;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(int funds){
        super(String.format("Nie możesz wyplacic %d, poniewaz nie masz tyle na koncie!", funds));
    }
}
