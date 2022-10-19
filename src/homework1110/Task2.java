package homework1110;

public class Task2 {
    //2) Переменная num может принимать 4 значения: 1, 2, 3 или 4. Если она имеет значение '1',
    // то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее.
    // Решите задачу через switch-case.
    public static void main(String[] args) {
        int arg1 = 5;
        switch (arg1){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autmn");
                break;
            default:
                System.out.println("Error");
        }
    }
}
