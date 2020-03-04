// Construa um programa que pede para o usuário informar usuário e senha.
// Depois seu programa deve continuar sendo executado até que o usuário
// informe usuário e senha corretamente.

// 03/04 - Solved String compare issue with str.equals(str obj)
// https://www.geeksforgeeks.org/compare-two-strings-in-java/
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        // First, variables
        Scanner scanner = new Scanner(System.in);
        account logInfo = new account();  
        account testinfo = new account();  
        boolean allowin = false;

        System.out.println("Favor inserir username");
        logInfo.Name = scanner.nextLine();
        System.out.println("Favor inserir password");
        logInfo.Password = scanner.nextLine();
        System.out.println("User registered successfully. Now please input your data again.");

        System.out.println(logInfo.Name);
        System.out.println(logInfo.Password);
        // If I let it as false completely, this would end up becoming a fun reversing challenge... Naaaah.
        do {
            System.out.println("Favor inserir username");
            testinfo.Name = scanner.nextLine();
            System.out.println("Favor inserir password");
            testinfo.Password = scanner.nextLine();
            if (testinfo.Name.equals(logInfo.Name) == false ){
                System.out.println("Sorry, you wrote your username incorrectly. Please try again.");
            } else if (testinfo.Password.equals(logInfo.Password) == false){
                System.out.println("Sorry, you wrote your password incorrectly. Please try again.");
            } else {
                allowin = true;
            }
        } while (allowin == false);

        System.out.println("username and password correct. Welcome " + logInfo.Name);
        
    }
}

class account {
    String Name, Password;
}
