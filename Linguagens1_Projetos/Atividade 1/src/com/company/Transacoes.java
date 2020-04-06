package com.company;
import java.util.Random;

public class Transacoes {
    //Nome = Nathan Brito da Silva;
    //RA = 17.00531-0;

    // Make random number
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // Creates QR code
    public String gerarQR(Contas quemRecebe, double valor){
        String qrCode;
        // qrCode = id;nome;valor;randomnumber
        //To quote jack the ripper - Let's go piece by piece
        qrCode = quemRecebe.getIdConta() + ";";
        qrCode += quemRecebe.getUsuario().getNome() + ";";
        qrCode += Double.toString(valor) + ";";
        qrCode += Integer.toString(getRandomNumberInRange(1000, 9999));
        return qrCode;
    }

    // Makes transaction
    public void receber(String qrCode, Contas pagador, Contas recebedor){
        if (pagador.getSaldo() == 0){
            System.out.println("Pagamento inválido - Não há dinheiro sobrando");
        } else{
            //Santified be .split. Saved me SO MANY times (before I learned regex)
            //Now friendship kinda ended with .split. Regex is my true friend now
            String[] dados = qrCode.split(";");
            // 0 -> ID, 1 -> Username, 2 -> Value, 3 -> Random number ("Unused" for now)
            if (dados[0].equals(recebedor.getIdConta()) && dados[1].equals(recebedor.getUsuario().getNome())){
                System.out.println("Pagamento válido. Executando...");
                pagador.sacar(Double.parseDouble(dados[2]));
                recebedor.depositar(Double.parseDouble(dados[2]));
                System.out.println("Operação terminada.");

            } else {
                System.out.println("System breach detected.");
                System.out.println("This attempt has been documented and the system will be disabled in 5 seconds.");
                System.out.println("Have a nice day.");
                System.out.println("Big Brother is watching you.");
            }
        }
    }
}
