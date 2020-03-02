package com.company;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double n1,n2 ;
        Scanner scanner = new Scanner(System.in);
	    //sout :^)
        System.out.println("Informe dois valores.: ");
        // Ctrl + d duplica a linha. Good.
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        // Reminder.: You can add 2 parameters already by just adding space
        if(n1 > n2){
            System.out.println("N1 maior");

        }
        else {
            System.out.println("N2 maior");
        }
    }
}
