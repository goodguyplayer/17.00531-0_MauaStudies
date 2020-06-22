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



}
