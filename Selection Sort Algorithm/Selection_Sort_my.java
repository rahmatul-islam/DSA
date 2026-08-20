import java.util.Arrays;

/**
 * Selection Sort Algorithm Implementation in Java.
 * Time Complexity: O(n^2) - Best, Average, and Worst cases.
 * Auxiliary Space: O(1) - In-place sorting.
 */
public class Selection_Sort_my {
    public static void main(String[] args) {
        // Sample unsorted array
        int[] arr = { 12, 3, 11, 56, 34, 35 };

        // Sort the array in ascending order
        selectionSort(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts an array of integers in ascending order using Selection Sort.
     * 
     * @param arr The array to be sorted
     * @return The sorted array reference
     */
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is the minimum
            int minimum = i;

            // Find the index of the minimum element in the remaining unsorted subarray
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j; // Update index of minimum element
                }
            }

            // Swap the found minimum element with the first element of the unsorted subarray
            if (minimum != i) {
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }
        }

        return arr;
    }
}

