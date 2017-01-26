package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean checkRange(ArrayList<Integer> array,int i, int j)
    {
	if(array==null)
		return false;
	if(array.size()==0)
		return false;        
	boolean result=true;
	for(int temp:array)
	{
	    if(temp<i || temp>j)
            {
               result=false;
               break;
            }
	}
	return result;
    }
}
