package com.company;

import java.util.ArrayList;

public class Vakje {
    int vakNummer;
    ArrayList<Speler> spelersOpVakje = new ArrayList<>();
    String speciaal = "";

    Vakje(int vakNummer) {
        this.vakNummer = vakNummer;
    }

    Vakje(int vakNummer, String speciaal) {
        this.vakNummer = vakNummer;
        this.speciaal = speciaal;
    }

    public void addSpelersOpVakje(Speler speler){
        spelersOpVakje.add(speler);
    }

    public void removeSpelerOpVakje(Speler speler){
        spelersOpVakje.remove(speler);
    }

    public void veldCheck(Speler speler){
        switch(this.vakNummer){
            case 6:
                System.out.println("Hee een brug, op naar 12.");
                speler.specialMove(12);
                break;
            case 19:
                System.out.println("Welkom in de herberg.");
                break;
            case 31:
                System.out.println("Je bent in de put gevallen.");
                break;
            case 42:
                System.out.println("Je bent verdwaald in het doolhof, terug naar 39.");
                speler.specialMove(39);
                break;
            case 52:
                System.out.println("Gevangenis.. ");
                break;
            case 58:
                System.out.println("Dood... Terug naar start.");
                speler.specialMove(0);
                break;
        }

    }

}
