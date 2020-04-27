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

        // Method 1
        for (int i = 0; i< animals.size(); i++){
            animals.get(i).comer();
        }

        // Method 2 (Enhanced for)
        // For (Class i (in): array)
        for (Animal animal: animals) {
            animal.comer();
        }

//        cachorro.comer();
//        lobo.comer();
//        peixe.comer();
    }
}
