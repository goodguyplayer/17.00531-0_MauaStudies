package Aula;

public class Peixe extends Animal implements Locomotion {
    @Override
    public void comer() {
        System.out.println("Bubbles");
    }

    @Override
    public void comoMeLocomove(){
        System.out.println("Nadando");
    }
}
