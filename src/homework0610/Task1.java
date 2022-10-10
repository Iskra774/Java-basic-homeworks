package homework0610;

import java.util.Scanner;

public class Task1 {
    // 1) С консоли вводится число - возраст человека
    //после чего вызывается метод, который возвращает ответ можно ли этому человеку смотреть фильм,
    // у фильма ограничение по возрасту не меньше 18.
    //Пример:
    //на входе число 19 пишется Можно идти смотреть кино
    //на входе число 7 пишется Нельзя идти смотреть кино
    public static boolean oldCheck(int arg1){
        boolean res = arg1 >= 18;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int arg1 = scanner.nextInt();
        if(oldCheck(arg1)){
            System.out.println("You can go watch a movie");
        }
        else{
            System.out.println("You can't go watch a movie");
        }
    }
}
