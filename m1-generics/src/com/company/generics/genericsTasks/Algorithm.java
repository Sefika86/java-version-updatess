package com.company.generics.genericsTasks;

public final class Algorithm {

    public static <T> T max(T x, T y){
       //return x>y ? x : y;
        return x.equals(y) ? x : y;
    }
}

/**
 Question: Will the class above compile? If not why?

 Answer: No, it won't compile, it will give compile error, because > can not be applied to T,
         because T only accepts objects ,and we can not say x object is greater than y object.
         We can use equals method to compare two objects
 */