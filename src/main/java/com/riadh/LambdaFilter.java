package com.riadh;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mnasri_r
 */
public class LambdaFilter {

    public void doSomething(){
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static void main( String[] args )
    {
        LambdaFilter demo = new LambdaFilter();
        demo.doSomething();
    }

}
