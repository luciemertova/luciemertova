package Priprava_cycles;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte celé číslo:");
        int fac = sc.nextInt();
        int answer = 1;

        for (int i = fac; i > 0 ; i--) {
            answer *= i;

        }
        System.out.println("Faktoriál čísla " + fac + "! = " + answer);
    }
}
