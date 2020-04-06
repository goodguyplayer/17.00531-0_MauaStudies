package com.company;

public class Contas {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;
    private String IdConta;
    private int saldo = 0;
    private Usuario usuario;

    public Contas(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }
}
