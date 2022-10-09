package homework0410;

import java.util.Scanner;

public class Level2 {
    public static boolean isItWorkCorrect(int temp1, int temp2){
        boolean res = temp1 > 100 && temp2 < 100;
        return res;
    }
    public static boolean isFirstDivisible(int arg1, int arg2){
        boolean res = arg1 % arg2 == 0;
        return res;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int arg1 = scanner.nextInt();
        System.out.println("Enter second number");
        int arg2 = scanner.nextInt();
        System.out.println("The first number is divisible by the second:" + isFirstDivisible(arg1, arg2));

    }
}