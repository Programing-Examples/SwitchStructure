package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int val = 1;
        System.out.println("Antes del switch");
        System.out.println("------------------");

        switch (val) {

            case 0:
                System.out.println("Caso 0");
                break;

            case 1:
                System.out.println("Caso 1");
                break;

            case 2:
                System.out.println("Caso 2");
                break;

            default:
                System.out.println("Otros casos");
                break;

        }

        //Using characters
        char character = 'C';
        System.out.println("\nAntes del switch");
        System.out.println("------------------");

        switch (character) {

            case'A':
                System.out.println("A!");
                break;

            case'B':
                System.out.println("B!");
                break;

            case'C':
                System.out.println("C!");
                break;

            default:
                System.out.println("Otros casos");
                break;

        }

        //Try it yourself
        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option: ");
        System.out.println("1. Saludar");
        System.out.println("2. Despedir");
        System.out.println("3. Felicitar");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Hola!!!");
                break;
            case 2:
                System.out.println("Adios!");
                break;
            case 3:
                System.out.println("Muchas felicidades!!!");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

        System.out.println("FIN del programa");

    }
}
