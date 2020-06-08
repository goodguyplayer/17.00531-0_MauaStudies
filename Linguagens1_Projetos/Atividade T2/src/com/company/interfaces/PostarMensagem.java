package com.company.interfaces;
import com.company.enums.Horarios;

public interface PostarMensagem {
    /**
     * Cada membro possui sua propria assinatura. Logo feito a interface.
     * @param horarios - Distinguir regular e extra
     * @return mensagem - Assinatura do hacker
     */
    public String postarMensagem(Horarios horarios);
}
