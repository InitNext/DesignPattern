package com.cyl.hello.designpattern.singleton;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DoubleCheckSingletonTest.class,
        LazyUnsafeSingletonTest.class,
        LazySafeSingletonTest.class,
        StaticNestedClassSingletonTest.class,
        UnLazySingletonTest.class,
        UnLazyVariantSingletonTest.class
})
public class SingletonSuiteTest {
}
