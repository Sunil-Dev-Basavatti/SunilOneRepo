package ex_05_TypeCasting;

public class Lab058_TypeCasting_01 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;// Widening --> Implicit casting
        int a1 = (int)b; // Widening --> Explicit casting
    }
}
