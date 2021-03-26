package com.company;

public class Speler {
    private String naam;
    private int laatsteWorp;
    private int huidigePlek = 0;

    Speler(String naam) {
        this.naam = naam;
    }

    public String getName() {
        return this.naam;
    }

    public void setLaatsteWorp(Dobbelsteen dobbelSteen) {
        this.laatsteWorp = dobbelSteen.gooien();
    }

    public int getLaatsteWorp() {
        return this.laatsteWorp;
    }

    public void setHuidigePlek() {
        this.huidigePlek += getLaatsteWorp();
        if (this.huidigePlek > 63) {
            System.out.println("Je bent over de 63 gegaan, achteruit.. ");
            this.huidigePlek = 63 - (this.huidigePlek - 63);
        }
    }

    public void specialMove(int veld){
        this.huidigePlek = veld;
    }

    public int getHuidigePlek() {
        return this.huidigePlek;
    }
}
