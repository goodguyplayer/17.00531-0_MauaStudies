package com.company;

public class Contas {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;

    //Variables
    private String idConta;
    private double saldo = 0;
    private Usuario usuario;
    private static int totalContas;


    // Set account with Usuario class and ID
    public Contas(Usuario usuario){
        //Stolen from aula 5 to set the ID
        Contas.totalContas = Contas.totalContas + 1;
        this.idConta = Integer.toString(Contas.totalContas);
        this.usuario = usuario;
    }

    // Calls the user whose account is connected to
    public Usuario getUsuario(){
        return usuario;
    }

    // getSaldo
    public double getSaldo() {
        return saldo;
    }

    // getID
    public String getIdConta(){
        return idConta;
    }

    // deposit value
    public void depositar (double valor){
        this.saldo += valor;
    }

    // withdrawal value
    public void sacar (double valor){
        if (this.saldo < valor){
            System.out.println("Não é possivel sacar");
        } else  {
            this.saldo -= valor;
        }
    }
}
