package org.astratto;

public class Passerotto extends Animal{
    public Passerotto(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("cip cip");
    }
    @Override
    public void cibo() {
        System.out.println("insetti");
    }
}
