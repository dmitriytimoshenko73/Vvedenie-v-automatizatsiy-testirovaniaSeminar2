package org.max.demo.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.demo.pattern.singleton.*;

public class SingletonTest {

    @Test
    void singletonSimpleTest () {
        //given
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        SimpleSingleton singleton2 = SimpleSingleton.getInstance();
        //when
        singleton2.setUrl("https://newurl");
        //then
        Assertions.assertSame(singleton, singleton2);
        Assertions.assertEquals("https://newurl", singleton.getUrl());
    }

    @Test
    void singletonLazyTest () {
        //given
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        //when
        singleton2.setUrl("https://newurl");
        //then
        Assertions.assertSame(singleton, singleton2);
        Assertions.assertEquals("https://newurl", singleton.getUrl());
    }

    @Test
    void staticBlockSingletonTest () {
        //given
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        //when
        singleton2.setUrl("https://newurl");
        //then
        Assertions.assertSame(singleton, singleton2);
        Assertions.assertEquals("https://newurl", singleton.getUrl());
    }

    @Test
    void lazyLoadSingletonTest () {
        //given
        LazyLoadSingleton singleton = LazyLoadSingleton.getInstance();
        LazyLoadSingleton singleton2 = LazyLoadSingleton.getInstance();
        //when
        singleton2.setUrl("https://newurl");
        //then
        Assertions.assertSame(singleton, singleton2);
        Assertions.assertEquals("https://newurl", singleton.getUrl());
    }

    @Test
    void threadSafeSingletonTest () {
        //given
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        //when
        singleton2.setUrl("https://newurl");
        //then
        Assertions.assertSame(singleton, singleton2);
        Assertions.assertEquals("https://newurl", singleton.getUrl());
    }

    @Test
    void enumTest() {
        //given
        //when
        //then
        Assertions.assertEquals("http://", Connection.URL.getValue());
    }
}
