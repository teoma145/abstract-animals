package org.astratto;

public class Passerotto extends Animal implements CanFly{
    public Passerotto(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("il passerotto fa cip cip");
    }
    @Override
    public void cibo() {
        System.out.println("il passerotto mangia insetti");
    }

    @Override
    public void volo() {
        System.out.println("sono un passerotto e posso volare");
    }
}
