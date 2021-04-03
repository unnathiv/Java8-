// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    public static List<Student> getAllStudents() {

        Student student1 = new Student("Unnathi", 2, 3.6, "female", Arrays.asList("Swimming", "basketball","Volleyball"));
        Student student2 = new Student("Adi", 3, 3.8, "male", Arrays.asList("Swimming"));
        Student student3 = new Student("Akhil", 4, 3.9, "male", Arrays.asList("Volleyball"));
        Student student4 = new Student("Unnathi Vallapureddy", 4, 4.0, "female", Arrays.asList("Swimming","Volleyball"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4);
        return students;
    }
}
