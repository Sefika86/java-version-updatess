package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        //How to create a STREAM from Array

        String[] courses = {"Java", "Sprint", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

        //How to create Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Sprint", "Agile");

        Stream<String> courseStream2 = courseList.stream();

        //----------------------------------------------------------------------------

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Ms", 102)
        );

        //now we will concert this source to a Stream

        Stream<Course> myCourseStream = myCourses.stream();

        //Another way Creating a stream: Stream.of() method
        Stream<Integer> stream = Stream.of(1,2,3,4);
    }
}
