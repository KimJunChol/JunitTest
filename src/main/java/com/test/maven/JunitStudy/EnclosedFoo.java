package com.test.maven.JunitStudy;

public class EnclosedFoo {
    private int age;

    public EnclosedFoo(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 20;
    }

    public int getPrice() {
        if (isAdult()) {
            return 2000;
        } else {
            return 1000;
        }
    }
}
