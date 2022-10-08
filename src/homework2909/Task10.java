package homework2909;

import java.util.Scanner;

public class Task10 {
    public double converterEtoD(String dol, String course){
        double res = Double.valueOf(course)*Double.valueOf(dol);
        return res;}
    public double revers(String euro, String course){
        double res = Double.valueOf(euro)/Double.valueOf(course);
        return res;
    }

    public static void main(String[] args) {
        Task10 convert = new Task10();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dollar/euro rate :");
        String course = scanner.nextLine();
        System.out.println("how many dollars do you want to exchange for euros?");
        String dol = scanner.nextLine();
        System.out.println("Result is:" + " " + convert.converterEtoD(course, dol));
        Task10 reversconvert = new Task10();
        System.out.println("Enter dollar/euro rate :");
        String course1 = scanner.nextLine();
        System.out.println("how many euros do you want to exchange for dollars?");
        String euro = scanner.nextLine();
        System.out.println("Result is:" + " " + reversconvert.revers(euro, course1));

    }
}
