package models;

import enums.Pagamento;
import enums.Status;

import java.util.Random;


/**
 * <h1> Classe Pedidos </h1>
 * Essa classe modela os pedidos, sendo que ela possa criar os pedidos, alterar os pedidos
 * (apenas o status, como pedido), gerar o ID e fazer a leitura de um dos pedidos entreges a classe.
 *
 * @author Nathan Brito da Silva - 17.00531-0
 * @version 1.0
 */
public class Pedidos {
    Pagamento pagamento;
    Status status;

    /**
     * Método usado para gerar uma string para simular o pedido feito.
     * @return String Retorna uma string no formato "ID;Descricao;Valor;Pagamento;Status"
     */
    public String criarPedido(){

        return "";
    }

    /**
     * Método usado para gerar um ID para o pedido na criação.
     * @return idGerado String para o ID
     */
    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}
