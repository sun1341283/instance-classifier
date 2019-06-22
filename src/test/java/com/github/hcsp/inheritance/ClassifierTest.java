package com.github.hcsp.inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ClassifierTest {
    public void test() {
        int number1 = new Random().nextInt();
        double number2 = new Random().nextDouble();
        String s = UUID.randomUUID().toString();
        List<Object> list =
                Arrays.asList(number1, s, number2, new Object(), new Object(), new Object());
        List<Number> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Object> others = new ArrayList<>();

        Classifier.classify(list, numbers, strings, others);

        AssertEquals(Arrays.asList(number1, number2), numbers);
        AssertEquals(Arrays.asList(s), strings);
        AssertEquals(3, others.size());
    }
}
