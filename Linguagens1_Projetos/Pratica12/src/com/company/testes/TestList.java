package com.company.testes;

import com.company.model.Jogo;
import com.company.model.ListaDeJogos;

public class TestList {
    public static void main(String[] args) {
        ListaDeJogos jogos = new ListaDeJogos();

        Jogo one = new Jogo("PC", "Halo");
        Jogo two = new Jogo("PC", "Diablo");
        Jogo three = new Jogo("PC", "Halo");

        jogos.addJogo(one);
        jogos.addJogo(two);
        jogos.addJogo(three);

        System.out.println("Game list.: " + jogos.toString());
    }
}
