package com.test.maven.JunitStudy;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesArrayTest {
    @DataPoints
    public static final String[] ARGS = {
        "arg1", "arg2", "arg3"
    };

    @Theory
    @Test
    public void stringDataPointTest2(String arg) {
        System.out.println("String ARG = " + arg);
    }
}
