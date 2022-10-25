package classwork2010;

import java.sql.SQLOutput;

public class Task2palindrom {
    public static void main(String[] args) {
        String palindrom = "domkomod";
        int lenght = palindrom.length();
        for(int i = 0; i < lenght/2; i++){
            char fromFirst = palindrom.charAt(i);
            char fromSecond = palindrom.charAt((lenght -1)  - i);
            if(fromFirst != fromSecond){
                System.out.println("ne palindrom");
                return;
            }
        }
        System.out.println("eto palindrom");




    }
}
