package homework1310;

public class Task2 {
    public static int isSimp(int arg1) {
        int sum = 0;
        for (int i = 1; i <= arg1; i++) {
            if (arg1 % i == 0) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arg1 = 21;
        if (isSimp(arg1)<=2){
            System.out.println("Number" + " " + arg1 + " " + "is simple");
        }
        else{
            System.out.println("This is not simple number");
        }
    }
}
