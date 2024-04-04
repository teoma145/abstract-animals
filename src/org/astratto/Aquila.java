package org.astratto;

public class Aquila extends Animal{
    public Aquila(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("screech");
    }
    @Override
    public void cibo() {
        System.out.println("carne");
    }
}
