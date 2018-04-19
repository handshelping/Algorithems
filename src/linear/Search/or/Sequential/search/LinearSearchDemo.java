package linear.Search.or.Sequential.search;

/*The linear search is the basic searching algorithm where the required 
 * value or element is being searched in a sequential manner.The linear search 
 * algorithm takes the required value and compares that value with all the 
 * elements in the array/list.If the element in array/list matches with the 
 * required value then it returns the index otherwise it returns-1. Linear search 
 * is preferable when our array/list contains less number of elements.*/


/*As we know, the linear search will compare the target value with every element in the array/list. 
If the list size is large then it not recommends to use linear search.
*/
public class LinearSearchDemo {

	public static void main(String[] args) {
		int array[]= {25,26,78,95,68,73,61,28,49};
		int target=61;
		int result=searchvaLue(array,target);
		 if (result != -1) {
	            System.out.println("the target value found...in index of "+result);
	        } else {
	            System.out.println("the target value not found...");
	        }
	}

	private static int searchvaLue(int array[],int target) {
		for(int i=0;i<array.length;++i) {
			if(array[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
