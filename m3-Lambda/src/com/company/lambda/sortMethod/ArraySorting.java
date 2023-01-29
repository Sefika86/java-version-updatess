package com.company.lambda.sortMethod;


public class ArraySorting {   //QuickSort, BubbleSort

    //this is how Java Language works;
    // Creating a class, then an object and a method to be called by the object
    //What if we want this method to have diff implementations: ex. Bubble Sorting
    //Then, create an interface and abstract method and a class to implement the interface
    //,and overridden the abstract method with specific implementation
    //then we can add that interface in our sort() method above:

    /*
    private void sort(){
        System.out.println("Quick Sorting Array");  //good only for QuickSorting

    }
     */

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();

        BubbleSort bs = new BubbleSort();

        as.sort(qs);  //Quick Sorting
        as.sort(bs);  //Bubble Sorting

        //Other Programming Lang. have functional programming feature;
        // which they can directly pass any actions in their methods.
        // JAVA says: "I have OOP concepts ,so with my OOP concepts I can pass any actions"
        //Inheritance, Abstraction, Polymorphism
        // this is how JAVA can pass different actions to that method:
        //creating different classes which implement the interface and
        //the private??? method below in main class can pass any action based on the polymorphism

        //This is called BEHAVIOR PARAMETERIZATION in java

        System.out.println("-------------------------------------------------------");
        //Lambda Expression

        Sorting quickSort = () -> System.out.println("Quick Sort");
        as.sort(quickSort);
        //or
        as.sort( () -> System.out.println("Quick Sorting") );

        //by doing this we do not need to create QuickSort and BubbleSort classes
    }


    private void  sort(Sorting sorting){
        sorting.sort();

    }




}
