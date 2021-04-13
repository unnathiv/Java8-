package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    public static List<String> namesList(){

        List<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());

        return studentList;
    }

    public static Set<String> namesSet(){

        Set<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());

        return studentList;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());

    }
}
