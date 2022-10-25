package homework2010;

public class Task3 {
    //3)распечатать треугольник из символов ^. Высоту выбирает пользователь.
    // Например: высота = 5, на экране
    public static void main(String[] args) {
        int h = 5;
        for(int i = 0; i < h;i++){
            for(int j = h+1; j > 0; j--){
              System.out.print(" ");}
            for(int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println("");}


    }
}
