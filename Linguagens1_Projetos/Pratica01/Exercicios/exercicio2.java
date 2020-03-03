import java.util.Scanner;
// Elabore um programa que leia dois nomes e duas idades, exiba a diferença
// entre essas idades na tela.

// Testando classes.
// Não entendo muito bem, mas melhor testar mesmo assim

// Class - https://www.w3schools.com/java/java_classes.asp
// Methods - https://www.w3schools.com/java/java_methods.asp
public class exercicio2 {
    public static void main(String[] args) {
        // First, variables
        Scanner scanner = new Scanner(System.in);
        forExercise parte1 = new forExercise();  
        forExercise parte2 = new forExercise();

        // Gather data, names and ages
        System.out.println("Favor colocar o primeiro nome");
        parte1.name = scanner.nextLine();
        System.out.println("Favor colocar a primeira idade");
        parte1.age = scanner.nextInt(); // Later ask teacher why I had to put a nextLine here. As in, it would immediatelly skip the second nextline after the nextint.
        parte2.name = scanner.nextLine();
        System.out.println("Favor colocar o segundo nome");
        parte2.name = scanner.nextLine();
        System.out.println("Favor colocar a segunda idade");
        parte2.age = scanner.nextInt();
        
        // Next, see which one is older, parte1.name or parte2.name.
        if (parte1.age > parte2.age){
            System.out.println(parte1.name + " é mais velho/velha do que " + parte2.name);
        } else if (parte1.age < parte2.age){
            System.out.println(parte2.name + " é mais velho/velha do que " + parte1.name);
        } else {
            System.out.println("Ambos tem a mesma idade");
        }

    }


    
}

class forExercise {
    String name;
    int age;    
}
