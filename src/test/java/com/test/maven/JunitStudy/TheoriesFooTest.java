package com.test.maven.JunitStudy;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class TheoriesFooTest {
	@DataPoint
    public static final String ARG1 = "arg1";

    @DataPoint
    public static final String ARG2 = "arg2";

    @DataPoint
    public static final int ARG3 = 1;

    @DataPoint
    public static final int ARG4 = 2;

    @Theory
    @Test
    public void stringDataPointTest(String arg) {
        System.out.println("String ARG = " + arg);
    }

    @Theory
    @Test
    public void intDataPointTest(int arg) {
        System.out.println("int ARG = " + arg);
    }
    
    

}
