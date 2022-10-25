package homework2010;

public class Task21 {
    //2 уровень
    //1) В кассу на пятипроцентный вклад положили 100 рублей. Какой станет сумма вклада через 10 лет?
    //12 процентов = 0.12 к примеру 12% от ста рублей 100 *0.12 = 12
    //посчитатйте сумму без капитализации
    //сумма без капитализации - это процент в конце срока + тело депозита
    //к концу третьего года 100 рублей + 36 рублей процентами
    //
    //посчитайте сумму с капитализацией в конце каждого года
    //капитализация в конце года - это прибавка процента к сумме в конце года
    //к концу первого года 112 рублей, на второй год считается 12 процентов уже от 112 рублей,  к концу второго года 125.44 рублей
    //к концу третьего года еще 12 процентов от 125.44 будет 140.5
    //
    //посчитатйте сумму с капитализацией в конце каждого месяца
    //капитализация в конце месяцы - это прибавка процента к сумме в конце месяца
    //в конце каждого месяца накопленный процент за месяц идет в тело вклада:
    //101 рубль во второй месяц, во второй месяц 12 процентов годовых от 101 рубля, во второй месяц от 102.01 в третий от 103.03

    static void summBezKapital (double deposit, double percent, int termOfDep){
        double summOfPerc = 0.0;
        for(int i = 1; i <= termOfDep;i++) {
            summOfPerc = summOfPerc + (deposit * percent / 100);
        }
        System.out.println("Summ of percent with no kapitalisation :" + " " + summOfPerc);
        System.out.println("Body of deposit:" + " " + deposit);
    }
    static void summWithKapital(double deposit, double percent, int termOfDep){
        double summOfPerc = 0.0;
        for(int i = 1; i <= termOfDep;i++) {
            summOfPerc = summOfPerc + (deposit * percent / 100);
            deposit = deposit + (deposit*percent/100);
            //System.out.println("Summ of percen for" + " " + i + " " + "year is:" + summOfPerc);
        }
        System.out.println("Summ of percent with yearly kapitalisation :" + " " + summOfPerc);
    }
    static void summWithKapitalForMonth(double deposit, double percent, int termOfDep){
        double summOfPerc = 0.0;
        termOfDep = termOfDep * 12;
        for(int i = 1; i <= termOfDep;i++) {
            summOfPerc = summOfPerc + (deposit * percent / 100/12);
            deposit = deposit + (deposit*percent/100/12);
            //System.out.println("Summ of percen for" + " " + i + " " + "year is:" + summOfPerc);
        }
        System.out.println("Summ of percent with monthly kapitalisation :" + " " + summOfPerc);

    }
    public static void main(String[] args) {
        double deposit = 100.0;
        double percent = 5.0;
        int termOfDep = 10;
        //1
        summBezKapital(deposit,percent,termOfDep);
        summWithKapital(deposit, percent, termOfDep);
        summWithKapitalForMonth(deposit, percent, termOfDep);


    }
}
