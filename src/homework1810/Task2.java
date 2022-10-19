package homework1810;

import java.util.Scanner;

public class Task2 {
    //2) Необходимо суммировать все нечётные целые числа в диапазоне,
    //
    // который введёт пользователь с клавиатуры
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sart numer:");
        int argStart = scanner.nextInt();
        System.out.println("Enter end numer:");
        int argEnd = scanner.nextInt();
        int summ = 0;
        for (int i = argStart; i <= argEnd;i++ ){
            if (i % 2 != 0){
                summ = summ + i;
            }
        }
        System.out.println("Summ of numers:" + " " + summ);


    }
}
