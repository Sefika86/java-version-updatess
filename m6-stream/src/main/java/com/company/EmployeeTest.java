package com.company;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("print all emails");

        EmployeeData.readAll() // we used the other way to create stream in EmployeeData (Stream.of) so do not need to  call stream
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("print all phone numbers");

        EmployeeData.readAll() // we used the other way to create stream in EmployeeData (Stream.of) so do not need to  call stream
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("print all phone numbers with the double colon operator");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
