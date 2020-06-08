package com.company;
import com.company.principal.Principal;
/**
 * Autores.:
 * 16.01147-3 Henrique Godoy
 * 17.00531-0 Nathan Brito da Silva
 */
public class Main {
    /**
     * Main - Para evitar de poluir o main, foi feito a classe "Principal", no qual
     * todo o codigo roda.
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.run();
    }
}
