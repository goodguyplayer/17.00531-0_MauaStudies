package com.company;
public class Main {
    public static void main(String[] args) {
        Jogador p1, p2;
        p1 = new Jogador("Goku", Jogada.PEDRA);
        p2 = new Jogador("Mario", Jogada.PAPEL);
        System.out.println(p1.competicao(p2));
    }
}