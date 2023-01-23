package org.example;

import java.util.function.Supplier;

public class Singleton {
    private static Singleton instance;

    Singleton() {}

    public static Singleton getInstance(Supplier<Singleton> supplier) {
        if (instance == null) {
            instance = supplier.get();
        }
        return instance;
    }
}

