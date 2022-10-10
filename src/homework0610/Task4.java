package homework0610;

import java.util.Random;

public class Task4 {
    //4) напишите программу, которая говорит выпал орел или решка
    //true - орел
    //false -решка
    //используйте Random и метод nextBoolean,


    public static void main(String[] args) {
        Random random = new Random();
        boolean orel = random.nextBoolean();
        System.out.println(orel);
        if (orel){
            System.out.println("Orel");
        }
        else{
            System.out.println("Reshka");
        }

    }

}
