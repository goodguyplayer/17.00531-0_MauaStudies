package Interfaces;

/**
 * Auxilia na autenticação do usuário.
 *
 * @param senha String usada para confirmar e permitir o uso de contas no sistema. No momento, há apenas uma conta.
 */

public interface Autenticacao {
    boolean autenticado(String senha);
}
