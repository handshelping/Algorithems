package binaray.search;
/*
 * Binary Search
When it comes to the binary search it is mandatory for the array/list must be 
already sorted. In binary search algorithm, we first take the required 
value to search and compare that value with the middle element in the array/list. 
If the required value and middle element value matches then we return the value. 
If the middle element value is greater than the required value then the required value
 has to be search in a lower half and if the middle element value is smaller than
  the required value then the required value has to be search in upper half. 
  This procedure has to be repeat until we get the matching value for required value.
   It is recommended to use binary search when there are large number of elements 
   in array/list.
 */

public class BinarySearch {
	

	public static void main(String[] args) {
		int array[]= {1, 5, 12, 16, 21, 40, 54, 97 ,98};
		int target=40;
		int result=searchValue(array,target,0,array.length-1);
		 System.out.println(array[result]+ " is at index "+result+" in the array");
		

	}
	public static int searchValue(int array[],int target,int start,int end) {
		int middle=(int)Math.floor(start+end)/2;
		  int value = array[middle];

	        if (value > target) {
	            return searchValue(array, target, start, middle - 1);
	        }
	        if (value < target) {
	            return searchValue(array, target, middle + 1, end);
	        }
	        return middle;
	    }
		
	}
