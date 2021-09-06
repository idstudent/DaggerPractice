package com.example.daggerpractice;

import org.junit.Test;

public class ExampleUnitTest {
    @Test
    public void TestHelloWorld() {
        MyComponent component = DaggerMyComponent.create();
        System.out.println(component.getString());
    }
}