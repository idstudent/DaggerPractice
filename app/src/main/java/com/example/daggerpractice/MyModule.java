package com.example.daggerpractice;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
    @Provides
    String provideHelloWorld() {
        return "hello world";
    }
}