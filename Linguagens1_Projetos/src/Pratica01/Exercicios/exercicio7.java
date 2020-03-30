// O usuário informa um valor e você apresenta a soma de todos os algarismos
// dele

//...  So what do you mean by that? If 579 is given, I need to return 5+7+9?
// Aight...
import java.util.Scanner;
public class exercicio7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fullNumbers, output = 0;
        System.out.println("Please input a number. I'll add them among themselves.");
        fullNumbers = scanner.nextInt();

        while (fullNumbers > 0) {
            output = output + fullNumbers % 10;
            fullNumbers = fullNumbers / 10;
        }
        System.out.println("Sum is .:" +  output);
    }
}