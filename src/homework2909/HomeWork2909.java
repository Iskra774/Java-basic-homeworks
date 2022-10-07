package homework2909;

import java.util.Scanner;

public class HomeWork2909 {

    public static String strconc(String str1 , String str2) {
        String str3 = str1 + str2;
        return str3;}
    public static int mult(int a1, int a2, int a3){
        int c = a1 * a2 * a3;
        return c;}
    public static int mult(short a1, int a2, int a3){
        int c = a1 * a2 * a3;
        return c;}
    public static int mult(int a1, short a2, int a3){
        int c = a1 * a2 * a3;
        return c;}
    public static int mult(int a1, int a2, short a3){
        int c = a1 * a2 * a3;
        return c;}
    public static int mult(short a1, short a2, int a3){
        int c = a1 * a2 * a3;
        return c;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lengthofString = scanner.nextLine();
        System.out.println(lengthofString.length());
        String str1 = "I love";
        String str2 = "Java";
        String str3 = strconc(str1, str2);
        System.out.println(str3);
        Home myHome = new Home(1, 2, 5, "black");

    }




}
