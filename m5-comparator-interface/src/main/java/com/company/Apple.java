package com.company;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Apple {
    private Color color; //colors are constant, so why don't we create an Enum class,instead of doing it String
    private int weight;


}

