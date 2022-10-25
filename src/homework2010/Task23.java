package homework2010;

import java.util.Random;

public class Task23 {
    //3) Проверка гипотезы Сиракуз
    //Возьмем любое натуральное число. Если оно четное - разделим его пополам,
    // если нечетное - умножим на 3, прибавим 1 и разделим пополам. Повторим эти действия
    // с вновь полученным числом. Гипотеза гласит,
    // что независимо от выбора первого числа рано или поздно мы получим 1.
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20);
        int counter = 0;
        System.out.println("Random number is:" + " " + number);
        if(number % 2 == 0){
            do {
                number = number/2;
                counter++;
            }while (number != 1);
        }
        else if(number % 2 > 0) {
            do {
                number = number*3+1/2;
                counter++;
            }while (number != 1);}

        System.out.println("Number of iterations :" + " " + counter);
    }
}
