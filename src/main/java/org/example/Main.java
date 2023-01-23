package org.example;

import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
        Supplier<Singleton> supplier = Singleton::new;
        if(SingletonTester.isSingleton(supplier)) {
            System.out.println("Singleton");
        } else {
            System.out.println("Not Singleton");
        }
    }
}

class SingletonTester
{
    public static boolean isSingleton(Supplier<Singleton> supplier)
    {
        Singleton instance1 = Singleton.getInstance(supplier);
        Singleton instance2 = Singleton.getInstance(supplier);

        return instance1 == instance2; // The method should return true
    }
}