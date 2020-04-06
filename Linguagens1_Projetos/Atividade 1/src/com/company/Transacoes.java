package com.company;
import java.util.Random;

public class Transacoes {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String gerarQR(Contas quemRecebe, double valor){
        String qrCode;
        // qrCode = id;nome;valor;randomnumber
        qrCode = Integer.toString(quemRecebe.getIdConta()) + ";";
        qrCode += quemRecebe.getUsuario().getNome() + ";";
        qrCode += Double.toString(valor) + ";";
        qrCode += Integer.toString(getRandomNumberInRange(1000, 9999));
        return qrCode;
    }

    public void receber(){
        return;
    }
}
