// Elabore um programa que permita o usuário informar o valor inicial e final de
// uma sequência, apresente a somatória e o produto entre todos os valores do
// intervalo

// Given first and last number, output sum and mult of all numbers in between.
// https://www.w3schools.com/java/java_data_types.asp
import java.util.Scanner;
public class exercicio6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, last;
        long multiplication = 1L, sum = 0L; // Due to size constraints, it's better to make it long.
        
        System.out.println("Please insert the first number");
        first = scanner.nextInt();
        System.out.println("Please insert the last number");
        last = scanner.nextInt();
        do{
            multiplication *= first;
            sum += first;
            first++;
        } while (first <= last);
        System.out.println(multiplication);
        System.out.println(sum);
    }
}