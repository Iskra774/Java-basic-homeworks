package classwork1810;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3){
            System.out.println(i);
            i++;
        }
        Random random = new Random();
        int number = random.nextInt(10000);
        int summ = 0;
        System.out.println(number);
        while (number > 0){
            int digits = number % 10;
            summ += digits;
            number/=10;
        }
        System.out.println(summ);
    }
}
