package com.test.maven.JunitStudy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FooTest {
    @Before // setUpのオーバーライドではなく、任意のメソッドにアノテーションをつける
    public void setUp() {
        // セットアップ処理
    }

    @After // tearDownのオーバーライドではなく、任意のメソッドにアノテーションをつける
    public void tearDown() {
        // 後処理
    }

    // テストケースとなるメソッドにTestアノテーションをつける。名前は自由。
    @Test
    public void method1DoSomething() { 

    	System.out.println("test1");
    }

    @Test
    public void testMethod2() {
    	System.out.println("test2");
    }
    
    
    @Test
    public void sumReturns3() {
        int c = Foo.sum(1, 2);
        assertThat(c, is(3));
    }

    @Test
    public void returnTrueReturnsTrue() {
        assertThat(Foo.returnTrue(), is(true));
    }

    @Test
    public void returnNullReturnsNull() {
        assertThat(Foo.returnNull(), is(nullValue()));
    }
    
    
    @Test(expected = IllegalArgumentException.class) // アノテーションで発生する想定の例外を指定できる。
    public void doSomethingThrowsIllegalArgumentExceptionWithNull() {
        Foo foo = new Foo();
        foo.doSomething(null); // テストのコード上で例外の発生を検知する必要がない。
    }
}
