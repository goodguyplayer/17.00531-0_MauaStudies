package Exercicio01;

public class ContaTesteDrive {
    public static void main(String[] args) {
        // Declarando c1 (empty objects = nullPointer)
        Conta c1;
        // instancia conta - Coloca referencia de um objeto
        c1 = new Conta();
        c1.cliente = new Cliente();
        // Acessa o titular da conta
        c1.cliente.nome = "Odair";
        System.out.println(c1.cliente.nome);
//        c1.titular = "Odair";
        Conta c2 = new Conta();
//        c2.cliente.nome = "Gohan";
//        c2.titular = "Gohan";
        c1.saldo = 2000;
        c1.visualizarSaldo();
        c2.visualizarSaldo();
        c1.sacar(3000);
        c1.visualizarSaldo();
        c1.transferirDinheiro(c2, 1000);
        c2.visualizarSaldo();

    }
}
