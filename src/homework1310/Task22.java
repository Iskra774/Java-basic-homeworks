package homework1310;

public class Task22 {
    public static void main(String[] args) {
        int count = 0;
        int summ = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                summ = summ + i;
                count = count + 1;
            }
        }
        int res = summ / count;
        System.out.println(summ);
        System.out.println(count);
        System.out.println("The average of even numbers is :" + " " + res);
    }
}
