package Aula;

public class Cachorro extends Animal{
    @Override
    public void comer() {
        System.out.println("Como como um lobo, mas sou um cao");
    }

    public void cheirar() {
        System.out.println("Sniff");
    }
}
