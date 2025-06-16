package ex_06_Ternary_Operator;

public class Lab065_TO_03 {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        //System.out.println(Math.min(x,y));
        int min = x < y? x : y;
        System.out.println(min);
    }
}
