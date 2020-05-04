package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("inicio main");
        metodo1();
        System.out.println("Fim main");
    }

    static void metodo1(){
        System.out.println("inicio metodo1");
        metodo2();
        System.out.println("Fim metodo 2");
    }

    static void metodo2(){
        System.out.println("inicio metodo 2");
        int[] array = new int[10];
        for (int i= 0; i<= 15; i++){
            try {
                array[i] = i;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Tentou acessar pos inválida.: " + i);
            }
            System.out.println(i);
        }
        System.out.println("Fim metodo 2");
    }
}
