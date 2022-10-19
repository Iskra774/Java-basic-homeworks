package homework1310;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int arg1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int arg2 = scanner.nextInt();
        System.out.println("Multiply the first number by the second, enter result : ");
        int res = scanner.nextInt();
        int mult = arg1*arg2;
        if(res == mult){
            System.out.println("You are wreit");
        }
        else {
            System.out.println("You are wrong");
        }


    }
}
