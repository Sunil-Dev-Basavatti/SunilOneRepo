package ex_06_Ternary_Operator;

public class Lab068_Max_Three_Num {
    public static void main(String[] args) {
        int num_one = 25;
        int num_two = 14;
        int num_three = 5;
        int result = (num_one>num_two)? (num_one>num_three) ? num_one : num_three :(num_two>num_three)? num_two : num_three;
        System.out.println(result);
    }
}
