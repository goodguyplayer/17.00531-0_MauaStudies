package models;
import java.util.ArrayList;
import java.util.Scanner;

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
    Scanner input;

    public void run(){
        String escolha = "1";
        while (escolha.equals("0")){
            options();
            escolha = input.nextLine();
            switch (escolha){
                case "1":
                    this.pedidosfeitos.add(pedidos.criarPedido());
                    break;

                case "2":
                    visualizacao();
                    break;

                case "3":
                    int helper = 1;
                    for (String item: this.pedidosfeitos) {
                        String[] parts = item.split(";");
                        System.out.println(helper + " - ID: " + parts[0]);
                        helper += 1;
                    }
                    System.out.println("Qual você quer alterar?");
                    String posicao = input.nextLine();

            }
        }



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

    /**
     * Método Visualização
     * Feito para ir em cada item da lista "pedidosfeitos" e colocar na tela seu resultado.
     */
    private void visualizacao(){
        for (String item: this.pedidosfeitos) {
            String[] parts = item.split(";");
            System.out.println("ID" + parts[0]);
            System.out.println("Descrição" + parts[1]);
            System.out.println("Valor" + parts[2]);
            System.out.println("Pagamento" + parts[3]);
            System.out.println("Status" + parts[4]);
        }
    }

    /**
     * Método atualização
     * Feito para realizar a atualização do pedido.
     */
    private void atualizacao(){
        System.out.println("Antes de proceder, favor inserir sua senha.:");
        String senha = input.nextLine();
        if(usuario.autenticado(senha)){

        }
    }

}
