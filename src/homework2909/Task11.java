package homework2909;

public class Task11 {
    public String  newMethod (String phrase, int indexofPhrase, int indexofChar){
        String resStr = phrase.substring(indexofPhrase);
        char a = phrase.charAt(indexofChar);
        String res ="Letter is:" + " " + a + " " + "New phrase:" + " " + resStr;
        return res;
    }

    public static void main(String[] args) {
        Task11 test = new Task11();
        String a1 = "Mama mila Ramu";
        int a2 = 10;
        int a3 = 3;
        System.out.println(test.newMethod(a1 , a2, a3));
    }
}
