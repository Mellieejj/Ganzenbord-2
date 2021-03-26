package com.company;

import java.util.ArrayList;

public class Bord {
    public ArrayList<Vakje> speelvelden = new ArrayList<>();

    void createBord() {
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


}
