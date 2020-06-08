package com.company.models;

import com.company.enums.Horarios;
import com.company.interfaces.PostarMensagem;

public class ScriptGuys implements PostarMensagem {
    private String mensagem;

    @Override
    public String postarMensagem(Horarios horarios) {

        switch (horarios){
            case REGULAR:
                this.mensagem = "Prazer em ajudar novos amigos de código!";
                break;
            case EXTRA:
                this.mensagem =  "QU3Ro_S3us_r3curs0s.py";
                break;
        }
        return this.mensagem;
    }
}