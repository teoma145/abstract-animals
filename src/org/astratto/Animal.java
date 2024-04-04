package org.astratto;

public abstract class Animal {
    private String animale;
    public Animal(String animale)throws IllegalArgumentException {
        if (animale.isEmpty()){
            throw new IllegalArgumentException("campo animale vuoto");
        }
        this.animale = animale;
    }


    public String getAnimal() {
        return animale;
    }

    public void setAnimal(String animale) {
        this.animale = animale;
    }
    public void sleep() {
        System.out.println("ZZZ");
    }
    public abstract void verso();
    public abstract void cibo();
}
