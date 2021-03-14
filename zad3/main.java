package com.company.zad3;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        Konto users[] = new Konto[10];
        for(int i=0; i< users.length;i++) {
            users[i] = new Konto();
        }

         while (true) {
             System.out.println("Podaj ID konta (Wpisz -1 by wyjsc)");
             int x = scanner.nextInt();
             if (x == -1) {
                 break;
             }

             int choice = 0;
             while (choice != 4) {
                 System.out.println("1.Sprawdz stan konta\n2.Wyplac srodki\n3.Wplac srodki\n4.Wyjdz");
                 choice = scanner.nextInt();

                 switch (choice) {
                     case 1:
                         users[x].info();
                         break;
                     case 2:
                         users[x].withdraw();
                         break;
                     case 3:
                         users[x].deposit();
                         break;
                     case 4:
                         System.out.println("Dowidzenia");
                         break;
                 }

             }
         }
    }
}
