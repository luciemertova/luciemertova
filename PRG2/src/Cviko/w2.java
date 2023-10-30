package Cviko;

import java.util.Random;

public class w2 {
    public static void main(String[] args) {

        Random random = new Random();
        int k1 = random.nextInt(6) + 1;
        int k2 = random.nextInt(6) + 1;
        int v = k1 + k2;

        if (v >= 10 || k1 == k2){
            System.out.println("Vyhrál jste. Vaše kostky dohromady dávají " + v);
        } else {
            System.out.println("Nevyhrál jste. Vaše kostky dohromadý dávají jenom " + v);
        }


    }
}
