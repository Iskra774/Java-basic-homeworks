package homework2010;

import java.util.Scanner;

public class Task7 {
    //7) Напишите метод, который принимает строку и два символа. В результате он возвращает заданную строку,
    // где каждый первый символ был заменен вторым символом. Вы должны использовать только методы length() и charAt()
    // класса String. Например: «Я всегда делаю домашнее задание»,
    // «a», «A» -> «Я всегдА делАю домашнее зАдАние».
    //используйте циклы\
    static void changerOfStrings(String testString, String firstChar, String secondChar) {
        int res = testString.length();
        char first = firstChar.charAt(0);
        char second = secondChar.charAt(0);
        for (int i = 0; i <= res - 1; i++) {
            if (testString.charAt(i) == first) {
                System.out.print(second);
                continue;
            }
            System.out.print(testString.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String testString = scanner.nextLine();
        System.out.println("Enter char 1:");
        String firstChar = scanner.nextLine();
        System.out.println("Enter char 2:");
        String secondChar = scanner.nextLine();
        changerOfStrings(testString, firstChar, secondChar);

    }
}