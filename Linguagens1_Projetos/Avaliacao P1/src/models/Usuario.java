package models;

/**
 * <h1>Classe Usuário</h1>
 * Essa classe extende a interface Autenticacao e, com a sua ajuda, verifica se a pessoa que está tentando acessar o sistema
 * é ou não um usuário da pizzaria. Além disso, essa classe permite que o usuário crie ou altere os pedidos feitos.
 *
 * @author Nathan Brito da Silva - 17.00531-0
 * @version 1.0
 */
public class Usuario {


    String nome, email, senha;
    boolean autorizado = false;


}
