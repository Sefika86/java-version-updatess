package com.company.lambda.tasks;

import lombok.*;

@AllArgsConstructor
@Data //==> includes @NoArgsConstructor, @Getter, @Setter, @ToString, but not include AllArgsCon.
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
}
