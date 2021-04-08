package MethodRerence;// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


import java.sql.SQLOutput;
import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is :"+ function.apply("Java 8"));
        System.out.println("Result of andThen is :"+function.andThen(addSomeString).apply("Java8"));
        System.out.println("Result of andThen is :"+function.compose(addSomeString).apply("Java8"));
    }

}
