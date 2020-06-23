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
 * @since 1.0
 */
public class SistemaPrincipal {
    Pedidos pedidos = new Pedidos();
    Usuario usuario = new Usuario("Rato que ri","ratoqueri@gmail.com.br");
    ArrayList<String> pedidosfeitos = new ArrayList<String>();
    Scanner input = new Scanner(System.in);

    /**
     * Metodo run
     * O metodo utilizado para realizar o loop do sistema e chamar os outros metodos de acordo com as opcoes escolhidas.
     */
    public void run(){
        int leave = 0;
        while (leave == 0){
            options();
            String escolha = input.nextLine();
            switch (escolha){
                case "1":
                    criarNovoPedido();
                    break;

                case "2":
                    visualizacao();
                    break;

                case "3":
                    atualizacao();
                    break;
                case "0":
                    System.out.println("Saindo do sistema. Que o rato ria na sua pizza.");
                    leave = 1;
                    break;
                default:
                    System.out.println("Comando não reconhecido. Resetando o menu...");
                    break;
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
            System.out.println("ID " + parts[0]);
            System.out.println("Descrição " + parts[1]);
            System.out.println("Valor " + parts[2]);
            System.out.println("Pagamento " + parts[3]);
            System.out.println("Status " + parts[4] + "\n");
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
            int helper = 0;
            System.out.println("Favor escolher qual para atualizar");
            for (String item: this.pedidosfeitos) {
                String[] parts = item.split(";");
                System.out.println(helper + "- ID: " + parts[0]);
                helper += 1;
            }
            int posicao = input.nextInt();
            pedidosfeitos.set(posicao, pedidos.alterarPedido(pedidosfeitos.get(posicao)));
        }
        else {
            System.out.println("Você não tem permissão para isso.");
        }
        System.out.println("Voltando ao menu principal...");
    }

    /**
     * Método criarNovoPedido
     * Feito para realizar a verificação do usuário e criar novo pedido
     */
    private void criarNovoPedido(){
        System.out.println("Antes de proceder, favor inserir sua senha.:");
        String senha = input.nextLine();
        if(usuario.autenticado(senha)){
            pedidosfeitos.add(pedidos.criarPedido());
        }
        else {
            System.out.println("Você não tem permissão para isso.");
        }
        System.out.println("Voltando ao menu principal...");
    }
}
