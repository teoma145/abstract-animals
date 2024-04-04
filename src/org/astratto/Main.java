package org.astratto;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane("cane1");
        cane.verso();
        cane.cibo();
        Delfino delfino = new Delfino("delfino1");
        delfino.verso();
        delfino.cibo();
        Passerotto passerotto = new Passerotto("passerotto1");
        passerotto.verso();
        passerotto.cibo();
        Aquila aquila = new Aquila("aquila1");
        aquila.verso();
        aquila.cibo();


    }
}
