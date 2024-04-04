package org.astratto;

public class Aquila extends Cane implements CanFly{
    public Aquila(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("l'aquila fa screech");
    }

    @Override
    public void volo() {
        System.out.println("sono un aquila e posso volare");
    }
}
