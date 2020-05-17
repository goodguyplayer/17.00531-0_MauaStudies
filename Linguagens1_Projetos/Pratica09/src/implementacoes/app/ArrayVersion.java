package implementacoes.app;

import implementacoes.models.Dog;

public class ArrayVersion {
    public void run(){
//        int [] meusInteiros = new int[10];
//        meusInteiros[3] = 42;
//        System.out.println("Value at pos 3.: " + meusInteiros[3] );
        Dog[] dogs = new Dog[3];
        Dog dog = new Dog("Thor","Golden",30);
        dogs[0] = dog;
        dogs[1] = new Dog("Fido", "dido", 12);
        dogs[2] = new Dog("Mel", "Rex", 40);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}
