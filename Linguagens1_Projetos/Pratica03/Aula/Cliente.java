public class Cliente{
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudarCPF(String cpf){
        if (validarCPF(CPF)){
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possivel alterar o CPF.");
        }
    }
    boolean validarCPF(){
        
    }
}