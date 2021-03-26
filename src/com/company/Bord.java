package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bord {
    Scanner scan = new Scanner(System.in);
    public ArrayList<Vakje> speelvelden = new ArrayList<>();
    private ArrayList<Speler> spelers = new ArrayList<>();
    Dobbelsteen dobbelsteen = new Dobbelsteen();

    public Bord() {
        for (int i = 0; i <= 63; i++) {
            Vakje veld = switch (i) {
                case 0 -> new Vakje(i, "Start");
                case 6 -> new Vakje(i, "Brug");
                case 19 -> new Vakje(i, "Herberg");
                case 31 -> new Vakje(i, "Put");
                case 42 -> new Vakje(i, "Doolhof");
                case 52 -> new Vakje(i, "Gevangenis");
                case 58 -> new Vakje(i, "Dood");
                case 63 -> new Vakje(i, "Finish");
                default -> new Vakje(i);
            };

            speelvelden.add(veld);
        }
    }

    void nieuwSpel() {
        System.out.println("Hoeveel spelers doen er mee?");
        int aantalSpelers = Integer.valueOf(scan.nextLine());
        for (int i = 0; i < aantalSpelers; i++) {
            spelers.add(new Speler("Speler " + (i + 1)));
        }
        System.out.println("Alle spelers staan op start.");
    }

    public void checkVeld(Vakje veld, Speler speler) {
        veld.veldCheck(speler);
    }

    private void beurt(Speler speler) {
        System.out.println("\n" + speler.getName() + " gooi de dobbelsteen(g).");
        String input = scan.next();

        if (input.equals("g")) {
            speler.setLaatsteWorp(dobbelsteen);
            speler.setHuidigePlek();
            System.out.println("Je hebt " + speler.getLaatsteWorp() + " gegooid. Je staat op veld " + speler.getHuidigePlek() + " " + speelvelden.get(speler.getHuidigePlek()).speciaal);
            for (Vakje vak : speelvelden) {
                if (vak.spelersOpVakje.contains(speler)) {
                    vak.removeSpelerOpVakje(speler);
                }
            }
            speelvelden.get(speler.getHuidigePlek()).addSpelersOpVakje(speler);
            checkVeld(speelvelden.get(speler.getHuidigePlek()), speler);

            System.out.println("Speelveld: " + speelvelden.get(speler.getHuidigePlek()).vakNummer);
            System.out.println("aantal spelers: " + speelvelden.get(speler.getHuidigePlek()).spelersOpVakje.size());
        } else {
            System.out.println("Whoops, de dobbelsteen viel op de grond, probeer nog eens! \uD83D\uDE1C");
            beurt(speler);
        }
    }

    void spel() {
        while (speelvelden.get(63).spelersOpVakje.size() == 0) {
            for (Speler speler : spelers) {
                beurt(speler);

                if (speler.getHuidigePlek() == 63) {
                    break;
                }
            }
        }
        speelvelden.get(63).spelersOpVakje.forEach(speler -> System.out.println(speler.getName() + " heeft gewonnen."));
    }


}
