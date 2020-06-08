package com.company.models;

import com.company.enums.Horarios;
import com.company.interfaces.PostarMensagem;

public class HeavyLifters  implements PostarMensagem {
    /**
     * Classe dos Heavy Lifters.
     * Implementa a interface "PostarMensagem"
     */
    private String mensagem;

    @Override
    public String postarMensagem(Horarios horarios) {

        switch (horarios){
            case REGULAR:
                this.mensagem = "Podem contar conosco!";
                break;
            case EXTRA:
                this.mensagem =  "N00b_qu3_n_Se_r3pita.bat";
                break;
        }
        return this.mensagem;
    }
}
