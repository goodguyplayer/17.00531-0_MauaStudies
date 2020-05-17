package implementacoes;

import java.util.LinkedList;

public class LinkedListVersion {
    public static void run(){
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("Pallete");
        cidades.add("Kanto");
        cidades.add("Pewter");
        cidades.add("Cerulean");
        cidades.add("Vermilion");
        cidades.add("Celadon");
        cidades.add("Lavander");

        for (String cidade: cidades){
            System.out.println(cidade);
        }
        cidades.forEach((cidade) -> System.out.println(cidade));
    }
}
