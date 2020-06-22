package models;
import java.util.ArrayList;

/**
 * <h1>Classe SistemaPrincipal</h1>
 * Classe feita para guardar os pedidos, ver quais sao os proximos, manter a maior parte em ordem.
 * E necessario a senha para os metodos "novoPedido" e "alterarPedido"
 *
 * @author Nathan Brito da Silva - 17.00531-0
 * @version 1.0
 */
public class SistemaPrincipal {
    Pedidos pedidos = new Pedidos();
    Usuario usuario = new Usuario("Rato que ri","ratoqueri@gmail.com.br");
    ArrayList<String> pedidosfeitos = new ArrayList<String>();

    public void run(){


    }

    /**
     * Método options
     * Feito para facilitar a adição de novas opções. Caso for necessário adicionar uma outra opção
     * tipo "cancelar pedido", adicionar aqui a opção e mudar as escolhas em run().
     */
    private void options(){
        System.out.println("Pizzaria - O rato que ri!");
        System.out.println("1 - Nova venda");
        System.out.println("2 - Verificar pedido");
        System.out.println("3 - Alterar pedido");
        System.out.println("0 - Nova venda");
    }

}
