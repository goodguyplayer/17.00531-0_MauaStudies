// Elabore um programa que determine o enésimo valor da sequência de Fibonnacci.

// "The next number is found by adding up the two numbers before it."
import java.util.Scanner;
public class exercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int before = 0, current = 1, ntimes, output;
        System.out.println("Please add the number of times it should add.");
        ntimes = scanner.nextInt();
        System.out.println("Loading fibbonacci...");
        System.out.println("Current position.: " + 1 + ", number.: " + 1);
        for (int i = 1; i < ntimes ; i++){
            output = before + current;
            before = current;
            current = output;
            System.out.println("Current position.: " + (i+1) + ", number.: " + current);
        }
    }
}