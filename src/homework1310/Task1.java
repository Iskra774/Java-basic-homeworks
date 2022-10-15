package homework1310;

import java.util.Scanner;

public class Task1 {
    static int leapYearCounter(int arg1, int arg2){
        int sum = 0;
        for(int i = arg1; i <= arg2; i++)
        {
            if (i % 4 == 0){
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number of year:");
        int firstNofY = scanner.nextInt();
        System.out.println("Enter second number of year:");
        int secondNofY = scanner.nextInt();
        System.out.println("Number of leap years :" + " " + leapYearCounter(firstNofY, secondNofY));
    }
}
