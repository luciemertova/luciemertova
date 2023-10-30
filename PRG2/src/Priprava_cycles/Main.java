package Priprava_cycles;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadávejte celá čísla, dokud nenapíšete -1 budu sbírat čísla...");
        int a = scanner.nextInt();
        int sum = 0;

        while (a != -1) {
            System.out.println("Zadejte další číslo: ");
            a = scanner.nextInt();
            sum += a;
        }
        System.out.println("Soucet všech zadaných čísel je: " + sum);
    }
}