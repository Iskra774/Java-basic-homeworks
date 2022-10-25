package homework2010;

public class Task4 {
    //4) вывести таблицу умножения от 1 до 10
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j<= 10; j++){
                int res = i * j;
                System.out.print(i + " "+ "*" + " " + j + " " + "=" + " "+ res + "  ");
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
