package homework1110;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(12) + 1;
        System.out.println(month);
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autmn");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
