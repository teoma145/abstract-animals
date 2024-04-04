package org.astratto;

public class Aquila extends Cane{
    public Aquila(String animale) {
        super(animale);
    }
    @Override
    public void verso() {
        System.out.println("l'aquila fa screech");
    }

}
