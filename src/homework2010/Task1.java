package homework2010;

public class Task1 {
    //1) Напечатать все четырехзначные числа, в записи которых нет двух одинаковых цифр.


    public static void main(String[] args) {
        for(int i = 1000; i<=9999; i++){
            int arg1 = i/1000;
            int arg2 = i%10;
            int res = i/10;
            int arg3 = res%10;
            int res1 = res/10;
            int arg4 = res1%10;
            if(arg1==arg2|arg1==arg3|arg1==arg4|arg2==arg3|arg2==arg4|arg3==arg4){
                continue;
            }
            else{System.out.println(i);}
        }

    }
}
