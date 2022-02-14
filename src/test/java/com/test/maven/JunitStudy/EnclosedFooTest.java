package com.test.maven.JunitStudy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class) // トップレベルのクラスにEnclosedを指定する。
public class EnclosedFooTest {
    // コンストラクタの引数が15の場合のテスト
    public static class TeenTest {

        private EnclosedFoo enclosedFoo;

        @Before
        public void before() {
            enclosedFoo = new EnclosedFoo(15);
        }

        @Test
        public void isAdultReturnsFalse() {
            assertThat(enclosedFoo.isAdult(), is(false));
        }

        @Test
        public void getPriceReturns1000() {
            assertThat(enclosedFoo.getPrice(), is(1000));
        }

    }

    // コンストラクタの引数が25の場合のテスト
    public static class AdultTest {

        private EnclosedFoo enclosedFoo;

        @Before
        public void before() {
            enclosedFoo = new EnclosedFoo(25);
        }

        @Test
        public void isAdultReturnsTrue() {
            assertThat(enclosedFoo.isAdult(), is(true));
        }

        @Test
        public void getPriceReturns2000() {
            assertThat(enclosedFoo.getPrice(), is(2000));
        }

    }
}
