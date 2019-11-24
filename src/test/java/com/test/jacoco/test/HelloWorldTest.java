package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	a = hw.Method3(5,0,0);
    	a = hw.Method3(5,0,1);
    	a = hw.Method3(5,-1,1);
    	a = hw.Method3(6,0,0);
    	a = hw.Method3(6,0,1);
    	a = hw.Method3(6,-1,0);
    	a = hw.Method3(6,-1,1);
    	// condition 2
    	int b = hw.Method3(4, -1, -3);
    	b = hw.Method3(6, -1, -3);
    	b = hw.Method3(4, -1, -1);
    	b = hw.Method3(6, -1, -1);

    	// condition 1
    	int c = hw.Method3(5, -1, 1);
        // condition 3
    	int d = hw.Method3(4, 0, -1);

    	int e = hw.Method3(6, -1, -1);

    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMiniCalculator(){

        HelloWorld hw = new HelloWorld();
        assertEquals(hw.miniCalculator(1,1,'+')==2,true);
        assertEquals(hw.miniCalculator(1,1,'-')==0,true);
        assertEquals(hw.miniCalculator(1,1,'*')==1,true);
        assertEquals(hw.miniCalculator(1,1,'/')==1,true);
        assertEquals(hw.miniCalculator(1,0,'/')==0,true);
        assertEquals(hw.miniCalculator(1,0,'(')==0,true);

    }
    @Test
    public void testIsBirthday(){
        HelloWorld hw = new HelloWorld();
        assertEquals(hw.isBirthday(1988,1,1),false);
        assertEquals(hw.isBirthday(2019,13,21),false);

        assertEquals(hw.isBirthday(1991,0,1),false);
        assertEquals(hw.isBirthday(1991,0,0),false);
        assertEquals(hw.isBirthday(1991,1,0),false);
        assertEquals(hw.isBirthday(1991,1,1),true);


        assertEquals(hw.isBirthday(1990,2,29),false);
        assertEquals(hw.isBirthday(1990,2,27),true);
        assertEquals(hw.isBirthday(1990,3,29),true);
        assertEquals( hw.isBirthday(1990,3,32),false);
        assertEquals( hw.isBirthday(1990,4,29),true);
        assertEquals(hw.isBirthday(1990,4,31),false);

        assertEquals(hw.isBirthday(2000,2,29),true);

        assertEquals(hw.isBirthday(2000,2,30),false);
        assertEquals(hw.isBirthday(2000,3,29),true);
        assertEquals(hw.isBirthday(2000,4,29),true);

        assertEquals(hw.isBirthday(2004,2,29),true);
        assertEquals(hw.isBirthday(2004,3,29),true);
        assertEquals(hw.isBirthday(2004,3,32),false);

        assertEquals(hw.isBirthday(2004,4,29),true);
        assertEquals(hw.isBirthday(2004,4,31),false);

    }
    @Test
    public void testIsTriangle(){
        HelloWorld hw = new HelloWorld();
        assertEquals(hw.isTriangle(-1,1,1),false);
        assertEquals(hw.isTriangle(1,-1,1),false);
        assertEquals(hw.isTriangle(1,1,-1),false);


        assertEquals(hw.isTriangle(1,2,3),false);
        assertEquals(hw.isTriangle(1,2,1),false);
        assertEquals(hw.isTriangle(2,1,1),false);
        assertEquals(hw.isTriangle(1,1,2),false);

        assertEquals(hw.isTriangle(3,4,5),true);
    }
    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        hw.Method4(0,1,2,3,4);
        hw.Method4(5,5,1,1,1);
        hw.Method4(5,5,1,2,1);
        hw.Method4(5,2,1,1,1);
        try{
            hw.Method4(5,4,3,2,1);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("can not devide by 0");
        }
        try{
            hw.Method4(3,4,2,2,1);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("can not devide by 0");
        }

    }
    @Test
    public void testBug(){
        HelloWorld hw = new HelloWorld();
        assertEquals(hw.bug(5),true);
        assertEquals(hw.bug(-5),false);

    }

}

