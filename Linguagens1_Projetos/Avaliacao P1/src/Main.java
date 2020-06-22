import models.Pedidos;

public class Main {
    public static void main(String[] args) {
        Pedidos pedidos = new Pedidos();
        String teste = pedidos.criarPedido();
        System.out.println(teste);
        teste = pedidos.alterarPedido(teste);
        System.out.println(teste);
    }
}
