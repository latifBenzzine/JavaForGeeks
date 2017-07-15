package com.latifbenzzine.challenges;
import java.util.Arrays;

public class TripleSum{
	
	
	boolean tripletSum(int x, int[] a) {
		   
	    for (int i = 0; i < a.length-2; i++)
		    {
		       
		       for (int j = i+1; j < a.length-1; j++)
		       {
		           
		           for (int k = j+1; k < a.length; k++)
		           {
		               if (a[i] + a[j] + a[k] == x)
		               {
		
		                 return true;
		               }
		           }
		       }
		    }
	    
			return false;
	}
	
	
	boolean find3Numbers(int a[],  int sum)
	{
	    int l, r;
	 
	    /* Sort the elements */
	    Arrays.sort(a);
	 
	    /* Now fix the first element one by one and find the
	       other two elements */
	    for (int i=0; i<a.length-2; i++)
	    {
	 
	        // To find the other two elements, start two index
	        // variables from two corners of the array and move
	        // them toward each other
	        l = i + 1; // index of the first element in the
	                   // remaining elements
	        r = a.length-1; // index of the last element
	        while (l < r)
	        {
	            if( a[i] + a[l] + a[r] == sum)
	            {
	                System.out.println(a[i] + "," +a[l] + "," + a[l]);
	                return true;
	            }
	            else if (a[i] + a[l] + a[r] < sum)
	                l++;
	            else // A[i] + A[l] + A[r] > sum
	                r--;
	        }
	    }
	 
	    // If we reach here, then no triplet was found
	    return false;
	}
}