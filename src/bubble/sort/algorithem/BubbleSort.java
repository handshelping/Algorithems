package bubble.sort.algorithem;

/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping 
the adjacent elements if they are in wrong order.In This blog i gave simple 
explanation about bubble sort ,a example pogrom on java and advantages and 
disadvantages of the bubble sort. 

Introduction 

Bubble sort is a simple yet effective sorting algorithm. Bubble sort is one of the
form of exchange sort.In Bubble sort data is placed adjacent to each other. The sort 
starts from one end (the beginning),compares
adjacent data and swaps them if they are in wrong order.it moves down to the list 
and continues doing so.
when it reaches the end of the data ,it starts over until all the data in the right 
order.
Example 
First Pass:
( 6 2 4 3 8 ) –> ( 2 6 4 3 8 ), Here, algorithm compares the first two elements, 
and swaps since 6 > 2.
( 2 6 4 3 8 ) –> ( 2 4 6 3 8 ), Swap since 6 > 4
( 2 4 6 3 8 ) –> ( 2 4 3 6 8 ), Swap since 6 > 3
( 2 4 3 6 8 ) –> ( 2 4 3 6 8 ), Now, since these elements are already 
in order (8 > 6), algorithm does not swap them.

Second Pass:
( 2 4 3 6 8 ) –> ( 2 4 3 6 8 )
( 2 4 3 6 8 ) –> ( 2 3 4 6 8 ), Swap since 4 > 3
( 2 3 4 6 8 ) –> ( 2 3 4 6 8 )
( 2 3 4 6 8 ) –> ( 2 3 4 6 8 )
Now, the array is already sorted, but our algorithm does not know if it is completed. 
The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass:
( 2 3 4 6 8 ) –> ( 2 3 4 6 8 )
( 2 3 4 6 8 ) –> ( 2 3 4 6 8 )
( 2 3 4 6 8 ) –> ( 2 3 4 6 8 )
( 2 3 4 6 8 ) –> ( 2 3 4 6 8 ) 
*/
public class BubbleSort {
	public static void printArray(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                     /*swap elements*/
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 56,4, 37, 2, 421, 90 };
        System.out.println("Array Before Bubble Sort");
        printArray(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        printArray(arr);
    }

}
/*Output of the above program
Array Before Bubble Sort
9 56 4 37 2 421 90 
Array After Bubble Sort
2 4 9 37 56 90 421 

When to use Bubble sort
Not much use in the real world, but is a great learning tool 
because it's easy to understand and fast implementation.
use when the fast algorithm is needed to sort.
an extremely small set of data.


When Not to use Bubble sort
when dealing with large set of data.
when you are looking for quick algorithm.compare to other sorting algorithm, 
bubble sort is really slow.
*/