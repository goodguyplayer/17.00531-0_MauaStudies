package com.company.interfaces;
import com.company.enums.Horarios;

public interface PostarMensagem {
    //Cada membro tem sua mensagem própria, logo temos essa interface.
    public String postarMensagem(Horarios horarios);
}
