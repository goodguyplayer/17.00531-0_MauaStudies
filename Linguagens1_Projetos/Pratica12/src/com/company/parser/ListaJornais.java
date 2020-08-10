package com.company.parser;

import com.company.implementacoes.json.JogoParser;
import com.company.model.ListaDeJogos;
import org.json.JSONArray;
import org.json.JSONObject;

public class ListaJornais {
    public static JSONArray toJson(ListaJornais lista){
        JSONArray json = new JSONArray();
        lista.().forEach(jogo -> {
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
