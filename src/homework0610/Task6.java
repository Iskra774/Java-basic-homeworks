package homework0610;

import java.util.Scanner;

public class Task6 {
    //1) пользователь вводит с консоли с помощью сканера 3 числа, после чего находится
    // максимальное число среди этих трех чисел (используйте if/else if /else и операции сравнения)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int arg1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int arg2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int arg3 = scanner.nextInt();
        if(arg1 > arg2) {
            if (arg1 > arg3) {
                System.out.println("the biggest number is:");
                System.out.println(arg1);}
        }
        else if(arg2 > arg3){
            System.out.println("the biggest number is:");
            System.out.println(arg2);
        }
        else {
            System.out.println("the biggest number is:");
            System.out.println(arg3);
        }


    }
}

