package com.company.implementacoes.json;

import com.company.model.Jogo;
import com.company.parser.StatusParser;
import org.json.JSONObject;

public class JogoParser {
    public static JSONObject toJson(Jogo jogo){
            JSONObject json = new JSONObject();
            json.put("platform", jogo.getPlatform());
            json.put("nome", jogo.getNome());
            json.put("status", jogo.getStatus());
            return json;
    }

    public static Jogo fromJson(JSONObject json){
        Jogo jogo = new Jogo(
                json.getString("platform"),
                json.getString("nome")
        );
        jogo.setStatus(StatusParser.toStatus(json.getString("status")));
        return jogo;
    }
}
