package classwork2010;

public class Task1exxelentnummer {
    static boolean isExellent(int number){
        int summ = 0;
        for (int i = 1; i <= (number/2);i++){
            if(number % i == 0){
                summ +=i;
            }
            if(summ > number){
                return false;
            }
        }
        return summ == number;
    }
    public static void main(String[] args) {
        for(int i = 1; i<= 10000; i++){
            if(isExellent(i)){
                System.out.println("This number is exellent :" + " " + i);
            }

        }
    }
}
