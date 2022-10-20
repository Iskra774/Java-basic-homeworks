package homework1810;

public class Task21 {
    //сломанный лифт
    //лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
    // Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей,
    // то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.

    //Ввод:
    //H = 200, N = 50, M = 1
    //Ответ: 5
    //Объяснение:
    //Первый подьем: 50 - 1 = 49
    //Второй подьем: 49 + 50 - 1 = 98
    //Третий подьем: 98 + 50 - 1 = 147
    //Четвертый подьем: 147 + 50 - 1 = 196
    //Пятый подьем: выйти за пределы H.
    //IEHFSIHFSIUFHSFHSFH
    public static void main(String[] args) {
        int counter = 0;
        int h = 200;
        int n = 50;
        int m = 1;
        int lift = 0;
        do {
            int arg = n - m;
            lift = lift + arg;
            counter++;
        } while (lift < h);
        System.out.println(counter);

    }
}