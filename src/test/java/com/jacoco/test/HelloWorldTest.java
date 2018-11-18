package com.jacoco.test;

import com.jacoco.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author lixuan1
 */

public class HelloWorldTest {

    @Test
    public void testMethod1(){
        HelloWorld helloWorld=new HelloWorld();
        String string=helloWorld.Method1();
        Assert.assertNotNull(string);
    }


}
