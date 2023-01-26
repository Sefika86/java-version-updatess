package com.company.generics.genericsTasks;

import java.util.Arrays;

public class SwapMethod {

    public static void main(String[] args){

       // Integer[] a = {1,2,3,4};
        String[] str = {"apple", "banana", "grapes", "orange"};
        swap(str,0,2);
        System.out.println(Arrays.toString(str)); //[3,2,1,4]
    }

    public static <T> void swap(T[] a, int i, int j){

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}

/*
Write a generic method to exchange the positions of two different elements in
array.

Integer[] a = {1,2,3,4};
swap(a,0,2);
System.out.println(Arrays.toString(a)); //[3,2,1,4]
 */