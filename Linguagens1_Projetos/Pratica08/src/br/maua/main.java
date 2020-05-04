package br.maua;
//import pacote.QualquerCoisa;

import pacote.QualquerCoisa;
import pacote.Dog;
// import pacote.*; //Geral/Import all

public class main {
    public static void main(String[] args) {
        QualquerCoisa meuQualquerCoisa = new QualquerCoisa();
        Dog doggy = new Dog(30);
        Dog doggo = new Dog(50);
        doggy.bark();
        meuQualquerCoisa.hello();
        doggo.bark();
        //QualquerCoisa meuQualquerCoisa = new QualquerCoisa(); // If import pacote.QualquerCoisa was written before

    }
}
