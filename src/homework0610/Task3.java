package homework0610;

import java.util.Scanner;

public class Task3 {
    //3)Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
    //Напишите программу которая спрашивает у покупатель сколько он хочет купить печенья,
    // после этого с помощью Scanner считывается число сколько печенья хочет купить покупатель,
    // после спрашивается сколько денег у покупателя и считывается число (сколько денег у покупателя),
    // программа должна написать может ли купить столько печенья за такие деньги, например
    //покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
    //покупатель хочет купить 12 печенек, у него 8 евро ответ  можно
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cookies do you want to buy?:");
        int numberOfCook = scanner.nextInt();
        System.out.println("How much euro do you have?:");
        int numberOfMoney = scanner.nextInt();
        if (numberOfCook <= numberOfMoney / 0.5){
            System.out.println("Yes you can buy this cookies");
        }
        else {
            System.out.println("Sorry, you cant buy this cookies");
        }
    }
}
