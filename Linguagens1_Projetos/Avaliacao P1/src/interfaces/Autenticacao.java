package interfaces;

/**
 * <h1> Interface Autenticacao </h1>
 * Essa interface auxiliará na autenticação do usuário.
 *
 * @author Nathan Brito da Silva - 17.00531-0
 */
public interface Autenticacao {

    /**
     * Autenticado - Realiza a autenticação.
     * @param senha Necessário para a verificação do usuário.
     * @return false se a senha não for igual registrada no sistema.
     * @return true se a senha for igual a que está registrada no sistema.
     */
    boolean autenticado(String senha);
}
