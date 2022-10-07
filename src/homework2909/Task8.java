package homework2909;

import java.util.Scanner;

public class Task8 {
    public int summ(String str1, String str2){
        int res = Integer.valueOf(str1) + Integer.valueOf(str2);
        return res;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the number :");
        String str1 = scaner.nextLine();
        System.out.println("Enter the number :");
        String str2 = scaner.nextLine();
        Task8 stringtoCount = new Task8();
        System.out.println("The result is :");
        System.out.println(stringtoCount.summ(str1, str2));

    }
}
