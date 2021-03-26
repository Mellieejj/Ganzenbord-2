package com.company;

import java.util.ArrayList;

public class Vakje {
    int vakNummer;
    ArrayList<Speler> spelersOpVakje = new ArrayList<>();

    Vakje(int vakNummer) {
        this.vakNummer = vakNummer;
    }

    public void addSpelersOpVakje(Speler speler){
        spelersOpVakje.add(speler);
    }

    public void removeSpelerOpVakje(Speler speler){
        spelersOpVakje.remove(speler);
    }

}
