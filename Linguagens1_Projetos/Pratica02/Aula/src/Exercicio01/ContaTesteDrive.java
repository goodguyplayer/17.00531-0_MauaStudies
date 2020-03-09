package Exercicio01;

public class ContaTesteDrive {
    public static void main(String[] args) {
        // Declarando c1 (empty object, nullPointer)
        Conta c1;
        // instancia conta - Coloca referencia de um objeto
        c1 = new Conta();
        // Acessa o titular da conta
        c1.titular = "Odair";
        System.out.printf("Titular.: " + c1.titular);
        Conta c2 = new Conta();
        c2.titular = "Gohan";
        System.out.println("Titular C2.: "+ c2.titular);
        c1.saldo = 2000;
        c1.visualizarSaldo();
        c2.visualizarSaldo();


    }
}
