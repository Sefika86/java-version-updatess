package com.company.lambda.apple;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Apple {
    private Color color; //colors are constant, so why don't we create an Enum class,instead of doing it String
    private int weight;


}

