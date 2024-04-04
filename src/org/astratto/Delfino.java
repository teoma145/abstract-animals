package org.astratto;

public class Delfino extends Animal{
    public Delfino(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("il delfino fa priiiii");
    }
    @Override
    public void cibo() {
        System.out.println("il delfino mangia pesce");
    }
}
