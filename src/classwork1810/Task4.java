package classwork1810;

public class Task4 {
    public static void main(String[] args) {
        int i = 182354;
        int res = 0;
        while (i > 0){
            int dig = i % 10;
            //System.out.println(dig);
            i = i /10;
            if (res < dig){
                res = dig;
            }
        }
        System.out.println(res);
    }
}
