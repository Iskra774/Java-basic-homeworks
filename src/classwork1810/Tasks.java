package classwork1810;

import java.util.Scanner;

public class Tasks {
    static int maxDivided(int number){
        for(int i = number/2; i > 0; i-- ){
            if (number % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMuch = scanner.nextInt();
        int howManyI  = howMuch;
        int atmCount = 0;
        while (howManyI > 0) {
            atmCount++;
            int maxDivided = maxDivided(howManyI);
            howManyI -= maxDivided;
        }
        System.out.println(atmCount);
    }
}
