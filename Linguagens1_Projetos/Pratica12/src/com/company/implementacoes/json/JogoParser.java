package com.company.implementacoes.json;

import com.company.model.Jogo;
import org.json.JSONObject;

public class JogoParser {
    public static JSONObject toJson(Jogo jogo){
            JSONObject json = new JSONObject();
            json.put("platform", jogo.getPlatform());
            json.put("name", jogo.getNome());
            json.put("status", jogo.getStatus());
            return json;
    }

    public static Jogo fromJson(JSONObject json){
        Jogo jogo = new Jogo(
                json.getString("plataforma"),
                json.getString("nome")
        );
        jogo.setStatus(json.getString("status"));
        return jogo;
    }
}
