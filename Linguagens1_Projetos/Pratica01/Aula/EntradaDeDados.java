import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.println("Informe seu nome.: ");
		nome = scanner.nextLine();
		// Had a bizarre sense of deja vu now. Yet I'm 100% certain i saw this before...
		System.out.println("Ola " + nome);
		int n1, n2;
		System.out.println("Informe dois numeros.:");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		System.out.println("Soma " + (n1 + n2));
	}

}
