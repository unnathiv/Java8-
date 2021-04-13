package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream().reduce(1,(a,b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream().reduce((a,b) -> a * b);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,4,1);

        List<Integer> newIntegers = Arrays.asList(1,3,4,1);
        System.out.println(performMultiplication(integers));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

    }
}
