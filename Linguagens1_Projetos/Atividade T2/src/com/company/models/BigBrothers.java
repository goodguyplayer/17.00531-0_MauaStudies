package com.company.models;

import com.company.enums.Horarios;
import com.company.interfaces.PostarMensagem;

public class BigBrothers implements PostarMensagem {
    private String mensagem;

    @Override
    public String postarMensagem(Horarios horarios) {

        switch (horarios){
            case REGULAR:
                this.mensagem = "- Sempre ajudando as pessoas membros ou não S2!";
                break;
            case EXTRA:
                this.mensagem =  "- ...";
                break;
        }
        return this.mensagem;
    }
}