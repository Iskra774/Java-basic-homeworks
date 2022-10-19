package homework1310;

public class Task3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 99; i++){
            if(i % 4 == 0 && i % 6 != 0){
                System.out.println(i);
            }
        }
    }
}
