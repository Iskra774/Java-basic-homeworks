package homework0610;

import java.util.Scanner;

public class Task2 {
    //2) напишите программу, которая принимает 1 число - год (можно с помощью Scanner или с помощью Random) и
    // выводит високосный год или нет

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int numberOfYear = scanner.nextInt();
        if (numberOfYear % 4 == 0){
            System.out.println(numberOfYear + " " + "is a leap year");}
        else {
            System.out.println(numberOfYear + " " + "is not a leap year");
        }

    }
}


