package org.astratto;

public class Cane extends Animal{
    public Cane(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("bau");
    }
    @Override
    public void cibo() {
        System.out.println("carne");
    }
}
