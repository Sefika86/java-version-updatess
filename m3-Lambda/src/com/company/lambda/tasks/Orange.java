package com.company.lambda.tasks;

import com.company.lambda.apple.Color;

public class Orange {  //apply lombok here later

    private int weight;
    private Color color;


    public Orange(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}

/*
Write a prettyPrintOrange method that takes aList of Oranges and that can be
parameterized with multiple ways to generate a String output from an orange
public static void prettyPrintOrange(List<Orange> inventory, ???){
for(Orange orange : inventory){
String output = ???.???(orange);
System.out.println(output);
}
}

Sample Output :
A Light GREEN orange
A Heavy RED orange
A Light GREEN orange

Sample Output :
An orange of 80g
An orange of 155g
An orange of 120g
 */