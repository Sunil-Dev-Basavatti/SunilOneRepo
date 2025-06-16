package ex_04_Operators;

import java.sql.SQLOutput;

public class Lab43_Interview {
    public static void main(String[] args) {
       String first_name= "Sunil";
       String last_name = "Dev";
       int a=10;
       int b =10;

        System.out.println(first_name + last_name +a+b);
        System.out.println(a+b+ first_name+last_name);


        System.out.println(first_name + last_name +(a+b));
        //BODMAS --> Brackets of Div, Mul, Add, Sub
    }
}
