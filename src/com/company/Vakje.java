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
}
