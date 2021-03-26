package com.company;

public class Speler {
    private String naam;
    private int laatsteWorp;
    private int huidigePlek = 0;

    Speler(String naam){
        this.naam = naam;
    }

    public String getName() {
        return this.naam;
    }

    public int setLaatsteWorp(Dobbelsteen dobbelSteen){
        this.laatsteWorp = dobbelSteen.gooien();
        return this.laatsteWorp;
    }

//    public int getLaatsteWorp(){
//        return this.laatsteWorp;
//    }


}
