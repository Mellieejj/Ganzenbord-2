package com.company;

public class SpeciaalVakje extends Vakje {
    String speciaal = "";

    SpeciaalVakje(int vakNummer, String speciaal) {
        super(vakNummer);
        this.speciaal = speciaal;
    }

    public void veldCheck(Speler speler) {
        switch (this.vakNummer) {
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

