package com.example.daggerpractice;

import javax.inject.Inject;

public class MyClass {
    @Inject // 의존성 주입을 받음
    String str;

    public String getStr() {
        return str;
    }
}
