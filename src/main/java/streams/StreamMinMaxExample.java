package streams;

import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    private static int findMaxValue(List<Integer> integerList){
       return  integerList.stream()
                .reduce(0, (x,y) -> x>y ? x :y);

    }

    private static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x<y ? x :y);

    }


    public static void main(String[] args) {

      List<Integer> integerList = Arrays.asList(6,7,8,9,10);
       int maxValue = findMaxValue(integerList);
        System.out.println("Max value :" +maxValue);

        Optional<Integer> minValueOptional = findMinValue(integerList);
        System.out.println("Min value Optional :" + minValueOptional);

        if(minValueOptional.isPresent()){
            System.out.println("The minimun value is :" + minValueOptional.get());
        }else{
            System.out.println("Empty input");
        }

    }
}
