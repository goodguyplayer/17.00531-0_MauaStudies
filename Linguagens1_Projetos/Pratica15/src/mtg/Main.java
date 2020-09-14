package mtg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runMe();
    }


    public static void runMe(){
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit == 0){
            menu();
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    try {
                        APIRequests.getName(name);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    break;
                case "2":
                    System.out.println("Please input type");
                    String type = scanner.nextLine();
                    try {
                        APIRequests.getTypes(type);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    break;

                case "3":
                    System.out.println("Please input rarity");
                    String rarity = scanner.nextLine();
                    try {
                        APIRequests.getRarity(rarity);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    break;

                case "0":
                    System.out.println("Exiting...");
                    exit = 1;
                    break;

                default:
                    System.out.println("Not understood. Try again");
            }
        }



    }

    public static void menu(){
        System.out.println("Choose your card.\n" +
                "1 - Look by name.\n" +
                "2 - Look by type.\n" +
                "3 - Look by rarity.\n" +
                "0 - Exit");
    }

}
