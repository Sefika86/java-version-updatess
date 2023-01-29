package com.company.generics.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

        printInfo(studentList);
      //  printInfo(teacherList);  ==>compile error

        System.out.println("------------------------------------------------");

        printInfo2(teacherList);
        printInfo2(studentList);

        System.out.println("------------------------------------------------");

        System.out.println("Last student of the student list: " + getLastItem(studentList));
        System.out.println("Last teacher of the teacher list: " + getLastItem(teacherList));

        System.out.println("------------------------------------------------");

        //if we put <T> in class signature in MyUtils Class, only we need to create its objects
        //under main and call your methods through the obj names

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfo2(studentList);
        System.out.println(obj1.getLastItem(studentList));


        MyUtils<Teacher> obj2 = new MyUtils<>();
        obj2.printInfo2(teacherList);
        System.out.println(obj2.getLastItem(teacherList));

//      MyUtils<String> obj3 = new MyUtils<String>();  this is good now but if I used<T extends ParentClass in my class level then this would be impossible


    }


    //*******************************************************************************************


    //** Write a method that takes a list of students, prints each student and the total student count.
    public static void printInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }



    // Write a method that takes a list, prints each item in it and its total item count.
    public static <T> void printInfo2(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
    }




    //write a method that takes a list and returns the last item of the list
    public static <T> T getLastItem(List<T> list) {
        return list.get(list.size() - 1);
    }

}
