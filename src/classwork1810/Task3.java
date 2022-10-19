package classwork1810;

public class Task3 {
    public static void main(String[] args) {
        int i= 1234;
        int revrse = 0;
        while ( i > 0){
            int res = i % 10;
            revrse = revrse *10 + res;
            i = i/10;
        }
        System.out.println(revrse);
    }
}
