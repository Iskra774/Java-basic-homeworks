package homework3;

import java.util.Locale;

public class Homework3 {
    public static void main(String[] args) {
        // 1. Создайте строку I study Basic Java!
        String str1 = "I study Basic Java!";
        System.out.println(str1);
        // 2. Распечатать последний символ строки. Используем метод String.charAt().
        int lengthofstr1 = str1.length();
        System.out.println(str1.charAt(lengthofstr1 - 1));
        // 3. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        boolean containofstr1 = str1.contains("Java");
        System.out.println(containofstr1);
        // 4. Заменить все символы “а” на “о”.
        String str2 = str1.replace("a", "o");
        System.out.println(str2);
        // 5. 6 Преобразуйте строку к верхнему регистру. Преобразуйте строку к нижнему регистру.
        String str1tolowercase = str1.toLowerCase();
        System.out.println(str1tolowercase);
        String str1touppercase = str1.toUpperCase();
        System.out.println(str1touppercase);
        // 7. Вырезать строку Java c помощью метода String.substring().
        int b1 = str1.indexOf("Java");
        String substringofstr1 = str1.substring(b1 , b1 + 4);
        System.out.println(substringofstr1);
        // 8. посчитать какой процент составляет число 200 от 470.
        double procent = (200/470.0) * 100;
        System.out.println(procent);
        // 9. напишите программу для подсчета какой индекс у символа 'g'.
        char asciiSymbol = 'g';
        int ascii = asciiSymbol;
        System.out.println(ascii);






    }
}
