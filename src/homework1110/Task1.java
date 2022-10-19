package homework1110;

import java.util.Random;

public class Task1 {
    //1) В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48. В третьем с 49 по 90.
    // Пользователь вводит номер квартиры. Программа должна указать
    // в каком подъезде находится данная квартира.
    public static void numberOfFront(int arg1){
        if (arg1 <= 20){
            System.out.println("Number of this front door is 1");
        }
        else if (arg1 <= 48){
            System.out.println("Number of this front door is 2");
        }
        else if (arg1 <= 90){
            System.out.println("Number of this front door is 3");
        }
        else {
            System.out.println("This number is not suitable");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arg1 = random.nextInt(91) + 1;
        numberOfFront(arg1);
        System.out.println(arg1);
    }
}
