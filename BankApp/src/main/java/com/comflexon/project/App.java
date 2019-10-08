package com.comflexon.project;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{	
	
	public int getInteger(int val,int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]==val)
				return i;
		return -1;
	}
	public void printArray(int[] arr)
	{
		for(int i:arr)
			System.out.println(i);
	}
	public int findMin(int[] arr)
	{
		int n = arr[0];
		for(int i:arr)
			n = Math.min(n, i);
		return n;
	}
	public int findMax(int[] arr)
	{
		int n = arr[0];
		for(int i:arr)
			n = Math.max(n, i);
		return n;
	}
	public int[] reverseArray(int[] arr)
	{
		int[] new_arr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
			new_arr[i] = arr[arr.length-i-1];
		
		return new_arr;
	}
	public int[] sortIntegers (int[] arr)
	{
		int[] array = Arrays.copyOf(arr,arr.length);
		if (array.length == 0)
			return array;
		for (int i = 0; i < array.length; i++)
			 for (int j = 0; j < array.length - 1 - i; j++)
				 if (array[j + 1] > array[j]) {
					 int temp = array[j + 1];
					 array[j + 1] = array[j];
					 array[j] = temp;
				 }
		return array;
	}
    public static void main( String[] args )
    {
        System.out.println("Please the number of element you wanna input");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] arr = new int[num];
        
        for(int i=0;i<num;i++)
        {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        
        App obj = new App();
        obj.printArray(arr);
        
        int test1 = obj.findMax(arr);
        System.out.println("The maximun is: " + test1);
        
        test1 = obj.findMin(arr);
        System.out.println("The minimun is: " + test1);
        
        int[] test2 = obj.reverseArray(arr);
        System.out.println("The reverse order is: ");
        for(int i:test2)
            System.out.print(i + " ");
        
        test2 = obj.sortIntegers(arr);
        System.out.println("The descending order is: ");
        for(int i:test2)
            System.out.print(i + " ");
        
        

        	
       
        
        
        
    }
}
