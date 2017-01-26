package com.mycompany.app;
import java.util.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
     public void testFound() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().checkRange(array,1,4));
    }
    public void testNegativeFound2(){
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(-1, -2,-3, -4));
      assertTrue(new App().checkRange(array,-5,0));
    }
    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().checkRange(array, 5,8));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<Integer>();
      assertFalse(new App().checkRange(array, 1,5));
    }

    public void testNull() {
      assertFalse(new App().checkRange(null, 1,5));
    }

}
