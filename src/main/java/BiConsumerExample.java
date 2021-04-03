// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


import java.sql.SQLOutput;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a:"+a +"b:" +b);
        };
        biConsumer.accept("Java7","Java8") ;
        nameAndActivities();
    }

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name +":"+activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }
}
