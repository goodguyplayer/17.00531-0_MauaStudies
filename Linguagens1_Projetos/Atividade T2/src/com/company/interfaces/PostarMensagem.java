package com.company.interfaces;
import com.company.enums.Horarios;
/**
 * Cada membro possui sua propria assinatura. Logo feito a interface.
 * @return mensagem - Assinatura do hacker
 */
public interface PostarMensagem {

    public String postarMensagem(Horarios horarios);
}
