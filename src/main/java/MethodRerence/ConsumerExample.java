package MethodRerence;// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu


import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    public static void printName(){
        Consumer<Student> c2 = (student)-> System.out.println(student);
        List<Student> studentList =  StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        Consumer<Student> c2 = (student) -> System.out.println(student.getName());
        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

        List<Student>  studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c4));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Java 8");
        printName();
        printNameAndActivities();
    }
}
