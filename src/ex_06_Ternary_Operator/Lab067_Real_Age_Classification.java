package ex_06_Ternary_Operator;

public class Lab067_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23;
        int age = 23;
        String result = (age < 18) ? "Minor" : (age < 65 ) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
