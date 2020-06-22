package models;

import enums.Pagamento;
import enums.Status;

import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);

        // Segmento - descricao
        System.out.println("Favor descrever o pedido.:");
        String descricao = input.nextLine();

        // Segmento - valor
        System.out.println("Quanto que foi.:");
        String valor = input.nextLine();

        // Segmento - pagamento
        System.out.println("Tipo de pagamento?");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Débito");
        System.out.println("3 - Crédito");
        System.out.println("4 - Vale alimentação");
        System.out.println("5 - Vale refeição");

        String tipopagamento = input.nextLine();
        switch (tipopagamento){
            case "1":
                pagamento = Pagamento.DINHEIRO;
                break;
            case "2":
                pagamento = Pagamento.DEBITO;
                break;
            case "3":
                pagamento = Pagamento.CREDITO;
                break;
            case "4":
                pagamento = Pagamento.VALE_ALIMENTACAO;
                break;
            case "5":
                pagamento = Pagamento.VALE_REFEICAO;
                break;
            default:
                System.out.println("Erro. Pagamento não identificado.");
        }

        // Segmento - Status
        status = Status.REALIZADO;

        // Retorna tudo
        return geradorId() +";"+
                descricao +";"+
                valor +";"+
                pagamento +";"+
                status;
    }

    /**
     * Método usado para alterar o pedido feito previamente.
     * No momento, só altera o status do pedido
     * @param pedido String representante do pedido feito. "ID;Descricao;Valor;Pagamento;Status", alterando apenas o final.
     * @return String Retorna o pedido feito, agora alterado devidamente.
     */
    public String alterarPedido(String pedido){


        return pedido;
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
