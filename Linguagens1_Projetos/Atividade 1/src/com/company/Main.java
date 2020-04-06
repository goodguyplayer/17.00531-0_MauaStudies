package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Nome = Nathan Brito da Silva;
        //RA = 17.00531-0;
        Scanner scanner = new Scanner(System.in);
        String username;

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


        System.out.println(c1.getUsuario().getNome());
        System.out.println(c1.getSaldo());
        System.out.println(c2.getUsuario().getNome());
        System.out.println(c2.getSaldo());
        System.out.println(c3.getUsuario().getNome());
        System.out.println(c3.getSaldo());
        System.out.println(c3.getIdConta());
        System.out.println(c2.getIdConta());
        System.out.println(c1.getIdConta());
    }
}
