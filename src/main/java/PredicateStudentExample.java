// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel(){
       List<Student> studentList = StudentDataBase.getAllStudents();
       studentList.forEach((student -> {
           if(p1.test(student)){
               System.out.println(student);
           }
       }));
    }

    public static void filterStudentByGpa(){
        System.out.println("****************************");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpaAndGrade(){
        System.out.println("__________________________");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.and(p1).test(student)){
                System.out.println(student);
            }
        }));
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentByGpaAndGrade();
    }
}
