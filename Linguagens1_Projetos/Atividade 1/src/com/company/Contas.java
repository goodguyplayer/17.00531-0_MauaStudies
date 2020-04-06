package com.company;

public class Contas {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;
    private String idConta;
    private int saldo = 0;
    private Usuario usuario;
    private static int totalContas;


    // Set account with Usuario class and ID
    public Contas(Usuario usuario){
        //Stolen from aula 5 to set the ID
        Contas.totalContas = Contas.totalContas + 1;
        this.idConta = Integer.toString(Contas.totalContas);
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getIdConta(){
        return idConta;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }
}
