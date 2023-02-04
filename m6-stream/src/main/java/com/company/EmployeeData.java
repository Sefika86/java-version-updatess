package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2269274385", "5488688286")),
                new Employee(200, "Ozzy", "ozzy@cydeo.com", Arrays.asList("1234567889", "9875643212")),
                new Employee(300, "Cundullah", "cundullah@cydeo.com", Arrays.asList("2264563789", "5483459876"))
                );
    }
}
