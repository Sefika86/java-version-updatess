package com.company.lambda;

public class Apple {
    private Color color; //colors are constant, so why don't we create an Enum class,instead of doing it String
    private int weight;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}

