package Exercicio01;

public class Conta {
    //Attributos da classe
    public int numero;
    public String titular, cpf;
    public double saldo;

    //Methods.:
    void visualizarSaldo(){
        // Use this to refer to the instance being executed.
        System.out.println("Saldo.: " + this.saldo);
    };
    void depositar(double valor){
        this.saldo += valor;
    };
    boolean sacar(double valor){
        if (this.saldo < valor) {
            return false;
        } else {
//            this.saldo = this.saldo - valor;
            this.saldo -= valor;
            return true;
        }
    };
    void transferirDinheiro(){

    };

}
