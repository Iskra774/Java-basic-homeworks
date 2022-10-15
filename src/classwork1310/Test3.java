package classwork1310;

public class Test3 {
    public static void main(String[] args) {
        for(int i = 10; i < 100; i++){
            for(int j = 10; j < 100; j++){
                if(i % j == 0 && i != j){
                    System.out.println(i + " : " + j);
                }
            }

            }
        }

}
