package interfaces;

/**
 * <h1> Interface Autenticacao </h1>
 * Essa interface auxiliara na autenticacao do usuario.
 *
 * @author Nathan Brito da Silva - 17.00531-0
 */
public interface Autenticacao {

    /**
     * Autenticado - Realiza a autenticacao.
     * @param senha Necessario para a verificacao do usuario.
     * @return false se a senha nao for igual a que esta registrada no sistema.
     * @return true se a senha for igual a que esta registrada no sistema.
     */
    boolean autenticado(String senha);
}
