package com.company.parser;

import com.company.implementacoes.json.JogoParser;
import com.company.model.Jogo;
import com.company.model.ListaDeJogos;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListaDeJogosParser {
    public static JSONArray toJson(ListaDeJogos lista){
        JSONArray json = new JSONArray();
        lista.getMinhaListaDeJogos().forEach(jogo -> {
            json.put(jogo);
        });
        return json;
    }

    public static ListaDeJogos fromJson(JSONArray json){
        ListaDeJogos lista = new ListaDeJogos();
        json.forEach( item -> {
            lista.addJogo(JogoParser.fromJson((JSONObject) item));
        });
        return lista;
    }

}
