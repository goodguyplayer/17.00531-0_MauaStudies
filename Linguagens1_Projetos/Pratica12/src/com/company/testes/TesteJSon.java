package com.company.testes;

import com.company.implementacoes.json.JogoParser;
import com.company.model.Jogo;
import org.json.JSONObject;

public class TesteJSon {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("PC", "Cyberpunk");
        JSONObject json = JogoParser.toJson(jogo1);
        System.out.println("Formato toString:" + jogo1.toString());
        System.out.println("-----------------");
        System.out.println("Formato json:" + json);
    }


}
