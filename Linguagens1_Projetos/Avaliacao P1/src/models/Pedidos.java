package models;

import enums.Pagamento;
import enums.Status;

import java.util.Random;

public class Pedidos {
    Pagamento pagamento;
    Status status;

    public String criarPedido(){

        return "";
    }

    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}
