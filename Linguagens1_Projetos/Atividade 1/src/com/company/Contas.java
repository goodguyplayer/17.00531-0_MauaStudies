package com.company;

public class Contas {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;
    private String IdConta;
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }
}
