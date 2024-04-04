package org.astratto;

public class Main {
    public static void main(String[] args) {
        try{
            Cane cane = new Cane("cane1");
            cane.verso();
            cane.cibo();
            Delfino delfino = new Delfino("delfino1");
            delfino.verso();
            delfino.cibo();
            delfino.nuoto();
            Passerotto passerotto = new Passerotto("passerotto1");
            passerotto.verso();
            passerotto.cibo();
            passerotto.volo();
            Aquila aquila = new Aquila("aquila1");
            aquila.verso();
            aquila.cibo();
            aquila.volo();
        }catch (IllegalArgumentException e){
            System.out.println("nome non presente");
        }

        Animal[] animals = {new Cane("cane2"), new Aquila("Aquila2"),
                new Delfino("Delfino2"),new Passerotto("Passerotto2")};
        for (Animal animal : animals) {
            animal.sleep();
            animal.verso();
            animal.cibo();
            if(animal instanceof CanFly){
                ((CanFly) animal).volo();
            }
            if(animal instanceof CanSwim){
                ((CanSwim) animal).nuoto();
            }
        }
    }
}
