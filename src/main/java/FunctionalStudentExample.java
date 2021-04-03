// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionalStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students ->{
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach((student ->{
            studentGradeMap.put(student.getName(),student.getGpa());
        }));
        return studentGradeMap;
    });
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()  ));
    }
}
