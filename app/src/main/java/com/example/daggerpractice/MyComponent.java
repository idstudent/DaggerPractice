package com.example.daggerpractice;

import dagger.Component;

@Component(modules = MyModule.class)
public interface MyComponent {
//    String getString();

    void inject(MyClass myClass);
}
