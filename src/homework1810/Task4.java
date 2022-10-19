package homework1810;


import java.util.Scanner;

public class Task4 {
    //Для введённого пользователем с клавиатуры натурального
    // числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int i = scanner.nextInt();
        int sum = 0;
        while (i > 0){
            int dig = i % 10;
            sum = sum + dig;
            i = i / 10;
        }
        System.out.println("Sum of numers is:" + " " + sum);
    }
}
