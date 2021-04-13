package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()  //Stream of student
                .map(Student::getActivities) //Stream of List of string - Stream<ListString<>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return studentActivities;
    }

    public static long activitiesCount(){
        long studentActivitiesCount = StudentDataBase.getAllStudents().stream()  //Stream of student
                .map(Student::getActivities) //Stream of List of string - Stream<ListString<>>
                .flatMap(List::stream)
                .distinct()
                .count();

        return studentActivitiesCount;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(activitiesCount());
    }
}
