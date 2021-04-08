package MethodRerence;// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String args[]){
        System.out.println("I am practicing Maven");

        List<String> list = new ArrayList<>();

        // [1, 2, 3, 4, 5, 6, 1, 2]

        List<String> result = new ArrayList<>();
        for(String str: list){
            if(str.equals("1")){
                result.add(str);
            }
        }

        list.stream().map(list1 -> list1.equals("1")).collect(Collectors.toList());

        // Imperative approach
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,8,9,10);

        List<Integer> uniqueList = new ArrayList<>();

        for(Integer integer : integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("UniqueList :"+ uniqueList);


        List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println("Declarative List:"+ uniqueList1);
    }
}
