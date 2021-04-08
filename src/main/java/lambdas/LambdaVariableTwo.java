package lambdas;

import java.util.function.Consumer;

public class LambdaVariableTwo {

    static int value  = 4;
    public static void main(String[] args) {
      //local variable

        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value+i);
        };
        c1.accept(4);
    }
}
