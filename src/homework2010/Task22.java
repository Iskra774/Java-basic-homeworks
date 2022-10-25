package homework2010;

import java.util.Scanner;

public class Task22 {
    //2) Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0. После ввода нуля,
    // показать на экран количество чисел, которые были введены, их общую сумму и среднее арифметическое.
    // Подсказка: необходимо объявить переменную-счетчик,
    // которая будет считать количество введенных чисел, и переменную, которая будет накапливать общую сумму чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        int counter = 0;
        do{
            System.out.println("Enter the number :");
            number = scanner.nextInt();
            counter ++;

        }while (number != 0);
        System.out.println("Number of trying :" + " " + counter);
    }
}
