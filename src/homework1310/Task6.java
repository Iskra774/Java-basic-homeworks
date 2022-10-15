package homework1310;

public class Task6 {
    public static void main(String[] args) {
        long mult = 1l;
        for(int i = 1; i <= 99; i++){
            if(i % 13 == 0){
                mult = mult*i;
            }
        }
        System.out.println(mult);
    }
}
