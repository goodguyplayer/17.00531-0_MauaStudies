package com.company.models;

import com.company.enums.Horarios;
import com.company.enums.Membro;
import com.company.interfaces.PostarMensagem;

public class MobileMembers implements PostarMensagem {
    public MobileMembers() {
    }


    @Override
    public String postarMensagem(Horarios horarios) {
        switch (horarios){
            case REGULAR:
                return "- Happy Coding!";
                break;
            case EXTRA:
                return  "- Happy_C0d1ng. Maskers";
                break;
        }
    }
}
