package quick.sort.algorithem;

import java.util.Arrays;

/*Quicksort algorithm is one of the most used sorting algorithm. When we have large 
lists/arrays to sort we can go for quicksort sorting algorithm . Quicksort is a 
divide and conquer algorithm. That means if we have to sort an array then we have 
to divide it into two arrays. These two divided arrays has to be sort individually 
and then these sorted arrays has to be merged to get the final sorted array.

Following steps we can follow when we have to use Quicksort algorithm:
If the array is empty array or only one element present in the array/list then that 
is already sorted array/list. If the array/list contains more then one element then:

 1) Select any element from the array/list as pivot element. 
Most of the time the middle index element is chosen as pivot element. 
2)After getting the pivot element we have to perform the partition operation, 
that is reordering the element before pivot element having value less than pivot 
element and the elements having value greater than pivot element should be after pivot
element.
3)Recursively we have to apply the above two steps on both the sub-lists.*/

public class QuickSortTest {
	public static void main(String[] args) {
        int[] intArray = { 2, 8, 9, 2, 12, 4, 7, 3, 7, 10 };
        System.out.println("Before QuickSorting:");
        System.out.println(Arrays.toString(intArray));
                
        quickSort(intArray, 0, intArray.length - 1);
        System.out.println("After QuickSorting:");
        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] arr, int low, int high) {
        /*check for array is null or not*/
        if (arr == null || arr.length == 0)
            return;
        /*check of array is empty or improper data send*/
        if (low >= high)
            return;

        /* picking up the pivot value from array based on middle index */
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        /* make left < pivot and right > pivot */
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        /* recursively sort two sub parts */
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

}
