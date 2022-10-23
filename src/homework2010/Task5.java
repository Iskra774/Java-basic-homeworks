package homework2010;

import classwork1810.While;

import java.util.Scanner;

public class Task5 {
    //5)С клавиатуры вводятся целые числа до первого числа,
    // которое меньше двух. Написать программу, которая определяет сколько простых чисел было введено.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sumOfSimple = 0;
        int sumOfDividers = 0;
        do{
            number = scanner.nextInt();
            for(int i = 1; i <= number; i++){
                if(number%i == 0){
                    sumOfDividers = sumOfDividers + 1;
                    System.out.println(sumOfDividers);
                }
               if (sumOfDividers > 2){
                   sumOfSimple = sumOfSimple + 1;
               }
            }

        }
        while (number != 2);
        System.out.println(sumOfSimple);
    }

}
