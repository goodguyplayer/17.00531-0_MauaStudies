package Aula;

public abstract class Canino extends Animal implements Locomotion  {
    public abstract void cheirar();

    @Override
    public void comoMeLocomove(){
        System.out.println("Andando");
    }
}
