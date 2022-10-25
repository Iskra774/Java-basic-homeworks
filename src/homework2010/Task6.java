package homework2010;

import java.util.Scanner;

public class Task6 {
    //6) Для каждого натурального числа в промежутке от M до N вывести все делители,
    // кроме единицы и самого числа. Значения M и N вводятся с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int m = scanner.nextInt();
        System.out.println("Enter second number:");
        int n = scanner.nextInt();
        for(int i = m; i <=n; i++)
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    System.out.println("dividers of" + i + "is" + j + "   ");
                }
            }
    }
}
