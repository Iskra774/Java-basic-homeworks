package homework0610;

import java.util.Scanner;

public class Task5 {
    //5) стране А ездят машины с номерами от 1 до 10000, в городе Б большая проблема с парковками
    // по выходным, чтобы уменьшить количество пробок, власти решили пускать в город по выходным только
    // легковые машины с четными номерами, напишите программу, которая принимает на вход два параметра:
    // номер машины и isLorry (грузовая машина или нет), в результате программа выводит можно заезжать машине или н
    // ет в город
    public static boolean canYouGo(int arg1, boolean arg2){
        boolean res = arg1 % 2 == 0 && arg1 <= 10000 && arg1 >= 1;
        boolean res1 = arg2;
        return res && res1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of yours car:");
        int numberOfcar = scanner.nextInt();
        System.out.println("Is your car Lorry(true or false)?");
        boolean isCar = scanner.nextBoolean();
        if (canYouGo(numberOfcar, isCar)){
            System.out.println("You can go");
        }
        else {
            System.out.println("You cant go");
        }
    }
}


