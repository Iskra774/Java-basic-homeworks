package homework0610;

import java.util.Scanner;

public class Task8 {
    //3) в том же городе Б решили доработать систему с пробками и решили усовершенствовать систему проезда в город,
    // теперь в выходные могут заезжать только легковые автомобили с четными номерами, а в будни все грузовые,
    // а так же машины с нечетными номерами. Напишите программу, которая принимает 3 параметра isWeekend, isLorry,
    // carNumber и пишет можно ли заезжать этой машине
    //4) Бонусная задача: допишите программу, чтобы она говорила почему нельзя заезжать этой машине, например
    //в выходной день пыталась заехать грузовая машина, ответ - в выходные грузовым нельзя
    public static void canCarGo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of car");
        int carsNumber = scanner.nextInt();
        System.out.println("Is to day Weekend(wreit true or false):");
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Is your car lorry(wreit true or false):");
        boolean isLorry = scanner.nextBoolean();
        if(isWeekend){
            if(!isLorry && carsNumber % 2 == 0){
                System.out.println("You can go");}
        }
        else if (!isWeekend){
            if (isLorry){
                System.out.println("You can go");
            }
        }
        else if(!isWeekend){
            if(carsNumber % 2 != 0){
                System.out.println("You can go");
            }
        }
        else
        {System.out.println("Today you can't go");}
    }

    public static void main(String[] args) {
        canCarGo();
    }
}
