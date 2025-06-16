package ex_05_TypeCasting;

public class Lab061_TypeCasting_03 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
       // int total = course + (int)GST;

        float total2 = course+GST;
        float total3 = (float)course+GST;
        System.out.println(total2);
        System.out.println(total3);


    }
}
