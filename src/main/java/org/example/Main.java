package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sisestage nimi: ");
            String sinunimi = scanner.nextLine();
            System.out.print("Sisestage perekonnanimi: ");
            String sinuperekonnanimi = scanner.nextLine();
            System.out.print("Sisestage ID: ");
            String id = scanner.nextLine();
            System.out.println(sinunimi +" "+ sinuperekonnanimi);
            String aasta = id.substring(1, 3);
            String a = id.substring(0);
            if (a.contains("4") || a.contains("3")) {
                System.out.println("Sünnipäev on: 19" + aasta + " aastaaeg");

            }
            if (a.contains("5") || a.contains("6")) {
                System.out.println("Sünnipäev on: 20" + aasta + " aastaaeg");
            }
            String month = id.substring(4, 5);
            System.out.println("Kuu: "+month);
            String day = id.substring(5, 7);
            System.out.println("Päev: "+day);
        }
    }
