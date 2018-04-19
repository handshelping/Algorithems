package merge.sort.algorithem;
/*Merge Sort Algorithm:
Merge sort is a divide-and-conquer algorithm. In this we have to break the list/array
in several parts or sub-lists until each sub list consists of a single element and 
merging those elements in so that we will get the final sorted list/array. Merge sort
is the recursive sorting algorithm.

Steps for using Merge sort algorithm:

1)Divide the list/array into two parts i.e. divide the array/list into right 
half and left half.
2)Divide the left half and right half of list/array into sub-lists until it becomes
only one element in the list/array.
3)Merge the elements into list of two element such a way that lesser value element 
will come first.
4)Merge all the elements until it become single sorted list.
Divide and Conquer Algorithm:
Consider we have a list of elements, so divide and conquer algorithm means 
dividing the list into sub-lists or sub-parts until no more sub-parts can be 
created. As shown in below diagram the list is divided in such a way that no more 
sub parts of the list will be created. This is called atomic nature of the list. 
After getting these atomice parts, the again the parts has to be sorted and converted 
into list from  the sub-parts or sub-lists. */

public class MergeSortAlgorithem {
	
public static void main(String[] args) {
        
        int[] inputArray = { 41, 30, 46, 6, 12, 85, 13 };
        int[] mergeSortedArray = doMergeSort(inputArray);
        
        for (int i = 0; i < mergeSortedArray.length; i++)
        {
            System.out.print(mergeSortedArray[i] + " ");
        }
    }

    public static int[] doMergeSort(int[] inputArray) {
        int n = inputArray.length;
        int a = 0;
        int b = 0;
        int c = 0;

        if (n == 1) {
            /* as only one element means already sorted */
            return inputArray;
        }

        int mid = n / 2;
        
        /* creating array for left side of middle index */
        int[] leftArray = new int[mid];
        
        /* creating array for right side of middle index */
        int[] rightArray = new int[n - mid];

        /* getting array on left side of middle index */
        System.arraycopy(inputArray, 0, leftArray, 0, leftArray.length);

        /* getting array on right side of middle index */
        System.arraycopy(inputArray, leftArray.length, rightArray, 0, rightArray.length);

        doMergeSort(leftArray);
        doMergeSort(rightArray);

        while (a < leftArray.length && b < rightArray.length) {
            if (leftArray[a] < rightArray[b]) {
                inputArray[c] = leftArray[a];
                a++;
            } else {
                inputArray[c] = rightArray[b];
                b++;
            }
            c++;
        }
        /* copy the rest of the first half if there is anything left */
        while (a < leftArray.length) {
            inputArray[c] = leftArray[a];
            a++;
            c++;
        }
        /* copy the rest of the second half if there is anything left */
        while (b < rightArray.length) {
            inputArray[c] = rightArray[b];
            b++;
            c++;
        }
        return inputArray;
    }

}
