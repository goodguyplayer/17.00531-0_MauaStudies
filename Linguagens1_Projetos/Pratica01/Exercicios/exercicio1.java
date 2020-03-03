import java.util.Scanner;

// Elabore um programa que pede para o usuário informar R.A., nome completo,
// telefone, email e idade. Apresente essas informações no formato chave:valor.
public class exercicio1 {

	public static void main(String[] args) {
		// Usando arrays por motivos de teste;
		// https://www.w3schools.com/java/java_arrays.asp

		String[][] dados = { { "RA", "nome completo", "telefone", "email", "idade" }, {"","","","",""} };
		int i;
		Scanner scanner = new Scanner(System.in);

		// Como estou fazendo 1:1, apenas preciso iterar no primeiro array e preencher os dados no segundo.
		for (i = 0; i < dados[0].length; i++){
			System.out.println("Favor digitar seu " + dados[0][i]);
			dados[1][i] = scanner.nextLine();
		}
		// Assim, dando sysout como pedido pelo exercicio.
		for (i = 0; i < dados[0].length; i++){
			System.out.println(dados[0][i] + ":" + dados[1][i]);
		}


	}

}
