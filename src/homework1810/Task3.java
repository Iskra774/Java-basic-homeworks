package homework1810;

import java.util.Random;

public class Task3 {
    //Создать программу, выводящую на экран случайно сгенерированное
    // трёхзначное натуральное число и его наибольшую цифру.
    public static void main(String[] args) {
        Random random = new Random();
        int res = random.nextInt(900)+100;
        System.out.println(res);
        int max = 0;
        while (res > 0){
            int dig = res % 10;
            res = res /10;
            if (max < dig){
                max = dig;
            }
        }
        System.out.println("Max number is:" + " " + max);

    }
}
