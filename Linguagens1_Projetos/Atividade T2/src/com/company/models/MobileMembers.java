package com.company.models;

import com.company.enums.Horarios;
import com.company.enums.Membro;
import com.company.interfaces.PostarMensagem;

public class MobileMembers implements PostarMensagem {
private String mensagem;

    @Override
    public String postarMensagem(Horarios horarios) {

        switch (horarios){
            case REGULAR:
                this.mensagem = "- Happy Coding!";
                break;
            case EXTRA:
                this.mensagem =  "- Happy_C0d1ng. Maskers";
                break;
        }
        return this.mensagem;
    }
}
