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

        //To quote jack the ripper - Let's go piece by piece
        qrCode = Integer.toString(quemRecebe.getIdConta()) + ";";
        qrCode += quemRecebe.getUsuario().getNome() + ";";
        qrCode += Double.toString(valor) + ";";
        qrCode += Integer.toString(getRandomNumberInRange(1000, 9999));
        return qrCode;
    }

    public void receber(String qrCode, Contas pagador, Contas recebedor){
        if (pagador.getSaldo() == 0){
            System.out.println("Pagamento inválido - Não há dinheiro sobrando");
        } else{
            //Santified be .split. Saved me SO MANY times (before I learned regex)
            //Now friendship kinda ended with .split. Regex is my true friend now
            String[] dados = qrCode.split(";");
            // 0 -> ID, 1 -> Username, 2 -> Value, 3 -> Random number ("Unused" for now)
            //if (Integer.parseInt(dados[0]) == recebedor.getIdConta() && dados[1].compareTo(recebedor.getUsuario().getNome())){

            //}

        }


        return;
    }
}
