package Aula;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();
        Peixe peixe = new Peixe();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cachorro);
        animals.add(lobo);
        animals.add(peixe);

        //Método 2
        System.out.println("Enhanced For (Foreach):");
        for (Animal animal : animals) {
            animal.comer();
            if(animal instanceof Canino){
                System.out.println("Canino!");
                ComportamentoCanino((Canino)animal);
            }
        }

        andaAe(cachorro);
        andaAe(lobo);
        andaAe(peixe);

    }

    public static void ComportamentoCanino(Canino canino){
        canino.cheirar();
    }

    public static void andaAe(Locomotion locomover){
        locomover.comoMeLocomove();
    }
}