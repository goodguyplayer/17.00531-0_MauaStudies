// Ler uma frase e verificar se ela é ou não um palíndromo.
// That means being able to be read back and forward. Got it.

// Using .charAt
// Is there any honor among thieves? https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/ 
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toTest;
        System.out.println("Please input string to test for palindrome.:");
        toTest = scanner.nextLine();
        if (tester(toTest)){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
        
    }
        static boolean tester(String test){
            int i = test.length() - 1 , j = 0;
            while(j< i){
                if (test.charAt(i) != test.charAt(j)) {
                    return false;
                }
                i--;
                j++;
            }
            return true;
        }
}