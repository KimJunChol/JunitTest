package com.test.maven.JunitStudy;

public class Foo {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean returnTrue() {
        return true;
    }

    public static Object returnNull() {
        return null;
    }
    
    public void doSomething(String arg) {

        if (arg == null) {
            throw new IllegalArgumentException("arg must not be null");
        }

        // do something.
    }
}
