package classwork1810;

import java.util.Random;
import java.util.Scanner;

public class Ugadai {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int secondPlayerNumber = 0;
        int howMuchWeGuess = 0;
        do{
            secondPlayerNumber = scanner.nextInt();
            if (number > secondPlayerNumber){
                System.out.println("No, number is bigger");
            }
            else if(number < secondPlayerNumber){
                System.out.println("No, number is lower");
            }
            howMuchWeGuess ++;

        }while (secondPlayerNumber != number);
        System.out.println("You win!!" + number + " " + "is" + howMuchWeGuess + " " + "trying");
    }
}
