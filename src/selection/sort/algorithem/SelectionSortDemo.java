package selection.sort.algorithem;

/*When we are sorting any list /array using selection sort algorithm the algorithm 
will first search the minimum value element from the array and will place it at 
the first position in the array. So the minimum value element will come at the 
first position. Now again it will search the minimum value element in the array/list
but will start searching from the second position. After getting the minimum value 
element it will put that element at the second position in the array/list. 
This cycle will be repeated until the complete array/list get sorted.*/

public class SelectionSortDemo {
	public static void main(String args[]) {
        int array[] = { 21, 12, 54, 16, 1, 5, 40, 97 };
        int n = array.length;
        sort(array);
        System.out.println("After Selection Sort...");
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
          }

    static void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            /* Find the minimum element in unsorted array */
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
