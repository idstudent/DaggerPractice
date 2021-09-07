package com.example.daggerpractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ExampleUnitTest {
//    @Test
//    public void TestHelloWorld() {
//        MyComponent component = DaggerMyComponent.create();
//        System.out.println(component.getString());
//    }

    @Test
    public void testMemberInjection() {
        MyClass myClass = new MyClass();
        String str = myClass.getStr();

        // str이 null이므로 result null이 나옴
//        assertNotNull("result null", str); // 널인지 아닌지 체크
        
        MyComponent myComponent = DaggerMyComponent.create();
        myComponent.inject(myClass);
        str = myClass.getStr();
        assertEquals("hello world", str); // 같은지 체크
        System.out.println(str);

    }
}