package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bord ganzenbord = new Bord();
        ganzenbord.createBord();

        for(int i = 0; i< ganzenbord.speelvelden.size(); i++){
            System.out.println(ganzenbord.speelvelden.get(i).vakNummer);
            System.out.println(ganzenbord.speelvelden.get(i).speciaal);
        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Naam:");
//        Speler speler1 = new Speler(scanner.nextLine());
//        System.out.println(speler1.getName());
//
//        Dobbelsteen dobbelsteen = new Dobbelsteen();
//        System.out.println(speler1.setLaatsteWorp(dobbelsteen));


    }
}
