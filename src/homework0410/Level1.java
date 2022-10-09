package homework0410;

import java.util.Scanner;

public class Level1 {
    public static boolean canBy(boolean arg1, boolean arg2){
       boolean res = arg1 || arg2;
       return  res;}
    public static boolean isDivided(String str1 ){
        int a = Integer.parseInt(str1);
        boolean res = a % 4 == 0 && a % 6 == 0;
        return  res;}
    public static boolean lengthOfString(String str2){
       boolean res = str2.length() < 7;
       return res;
    }
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWindy =true;
        boolean canSwim = isSunny == true && isWindy == false;
        System.out.println(canSwim);
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        System.out.println("I can buy food, thats:" + " " + canBy(isEdekaOpen , isReweOpen) );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String input = scanner.nextLine();
        System.out.println("Integer" + " " + input + " " + "is can dividen on 4 an 6, thats:" + " " + isDivided(input));
        System.out.println("Enter the string:");
        String newString = scanner.nextLine();
        System.out.println("The string contain less then 7 charts, thats:" + " " + lengthOfString(newString));




    }
}


