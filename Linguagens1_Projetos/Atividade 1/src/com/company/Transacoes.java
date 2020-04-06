package com.company;
import java.util.Random;

public class Transacoes {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
