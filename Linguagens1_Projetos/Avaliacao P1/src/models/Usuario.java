package models;

import interfaces.Autenticacao;

/**
 * <h1>Classe Usuário</h1>
 * Essa classe extende a interface Autenticacao e, com a sua ajuda, verifica se a pessoa que está tentando acessar o sistema
 * é ou não um usuário da pizzaria. Além disso, essa classe permite que o usuário crie ou altere os pedidos feitos.
 *
 * @author Nathan Brito da Silva - 17.00531-0
 * @version 1.0
 * @since 1.0
 */
public class Usuario implements Autenticacao {

    String nome, email, senha;
    boolean autorizado = false;

    /**
     * Constructor Usuario.
     * Esse construtor e utilizado para criar o Usuario, apesar de todos os parametros serem registrados no sistema.
     * @param nome Nome do usuario. Nesse caso, e o "Rato que ri"
     * @param email email do usuario. Nesse caso, e o "ratoqueri@gmail.com.br"
     */
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    /**
     * Metodo autenticado.
     * Metodo utilizado para verificar se a senha está correta. Caso positivo, retorna positivo, else negativo.
     * @param senha Necessario para a verificacao do usuario.
     * @return
     */
    @Override
    public boolean autenticado(String senha) {
        if (senha.equals("123456")){
            return true;
        }
        else{
            return false;
        }
    }
}
