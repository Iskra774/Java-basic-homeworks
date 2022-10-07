package homework2909;

public class Task5 {
    public double converttoC (int far){
        double res = (far - 32) / 1.8;
        return res;
    }
    public double convertertoF(double cel){
        double res = cel * 1.8 + 32;
        return res;

    }

    public static void main(String[] args) {
        Task5 counterC = new Task5();
        int far = 50;
        System.out.println(counterC.converttoC(far));
        Task5 counterF = new Task5();
        double cel = 10.0;
        System.out.println(counterF.convertertoF(cel));

    }
}
