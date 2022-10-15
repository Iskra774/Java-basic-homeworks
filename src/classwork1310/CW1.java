package classwork1310;

import java.util.Scanner;

public class CW1 {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        // вывести консоль сумму четных чисел от 20 до 40
        int sum = 0;
        for (int i = 20; i < 40; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        int arg1 = scanner.nextInt();
        int res = 0;
        for(int i = 1; i <= arg1; i++){
            res = res + i;
        }
        System.out.println(res);
        int n =scanner.nextInt();
        double res1 = 0.0;
        double arg2 = 1.0;

        for(int i = 1; i <= n; i++, arg2 = arg2 / 2){
            res1 = arg2 + res1;
        }
        System.out.println(res1);


    }
}
