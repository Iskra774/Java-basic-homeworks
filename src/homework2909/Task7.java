package homework2909;

public class Task7 {
    public double calc(int arg1) {
        double res = ((arg1*arg1)*3.14)*40;
        return res;
    }



    public static void main(String[] args) {
        Task7 count = new Task7();
        int rad = 14;
        System.out.println("kalory of pizza with radius"+ " " + rad +" " +"is" + " " + count.calc(rad));
        Task7 count1 = new Task7();
        int rad1 = 12;
        System.out.println("kalory of pizza with radius"+ " " + rad1 +" " +"is" + " " + count1.calc(rad1));
    }


}
