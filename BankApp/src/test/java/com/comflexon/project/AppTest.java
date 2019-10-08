package com.comflexon.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	App obj;
	int[] arr;
	
	 @Before
	 public void setUp()
	 {
		obj = new App();
		arr = new int[]{9,6,2,5,3};
	 }
	@Test
	public void testGetInteger()
	{
		Integer expResult = 0;
		Integer result = obj.getInteger(9, arr);
		assertEquals(expResult,result);
	}
    @Test
    public void testFindMin()
    {
    	Integer expResult = 2;
    	Integer result = obj.findMin(arr);
    	assertEquals(expResult,result);
    	
    }
    @Test
    public void testFindMax()
    {		
    	Integer expResult = 9;
    	Integer result = obj.findMax(arr);
    	assertEquals(expResult,result);
    	
    }
	@Test
	public void testReverseArray()
	{
		int[] expResult = new int[]{3,5,2,6,9};
		int[] result = obj.reverseArray(arr);
		assertTrue(Arrays.equals(expResult, result));
	}
	@Test
	public void testSortIntegers()
	{
		int[] expResult = new int[]{9,6,5,3,2};
		int[] result = obj.sortIntegers(arr);
		assertTrue(Arrays.equals(expResult, result));
	}
	
    
}
