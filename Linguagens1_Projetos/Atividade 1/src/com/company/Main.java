package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Nome = Nathan Brito da Silva;
        //RA = 17.00531-0;
        Scanner scanner = new Scanner(System.in);
        Transacoes transacoes = new Transacoes();
        String username, qrcode;

        //First account
        System.out.println("Favor colocar o nome da primeira conta.: ");
        username = scanner.nextLine();;
        Usuario user1 = new Usuario(username);
        Contas c1 = new Contas(user1);
        c1.depositar(1000);

        //Second account
        System.out.println("Favor colocar o nome da segunda conta.: ");
        username = scanner.nextLine();;
        Usuario user2 = new Usuario(username);
        Contas c2 = new Contas(user2);
        c2.depositar(250);

        //Third account
        System.out.println("Favor colocar o nome da terceira conta.: ");
        username = scanner.nextLine();;
        Usuario user3 = new Usuario(username);
        Contas c3 = new Contas(user3);
        c3.depositar(3000);

        //For fun - Output the initial data
        System.out.println("Primeira conta.: " + c1.getUsuario().getNome() + " , ID.: " + c1.getIdConta());
        System.out.println(c1.getSaldo());
        System.out.println("Segunda conta.: " + c2.getUsuario().getNome() + " , ID.: " + c2.getIdConta());
        System.out.println(c2.getSaldo());
        System.out.println("Terceira conta.: " + c3.getUsuario().getNome() + " , ID.: " + c3.getIdConta());
        System.out.println(c3.getSaldo());

        //Account 1 asks for 250
        qrcode = transacoes.gerarQR(c1, 250);
        // .receber(qrcode, payer, receiver)
        transacoes.receber(qrcode, c2, c1);
        transacoes.receber(qrcode, c3, c1);
        transacoes.receber(qrcode, c2, c1);

        //Account 2 asks for 1000
        qrcode = transacoes.gerarQR(c2, 1000);
        transacoes.receber(qrcode, c3, c2);

        //Now output final data
        System.out.println("Primeira conta.: " + c1.getUsuario().getNome() + " , ID.: " + c1.getIdConta());
        System.out.println(c1.getSaldo());
        System.out.println("Segunda conta.: " + c2.getUsuario().getNome() + " , ID.: " + c2.getIdConta());
        System.out.println(c2.getSaldo());
        System.out.println("Terceira conta.: " + c3.getUsuario().getNome() + " , ID.: " + c3.getIdConta());
        System.out.println(c3.getSaldo());
    }
}
