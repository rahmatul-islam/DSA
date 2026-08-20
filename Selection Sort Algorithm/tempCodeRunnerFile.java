import java.util.Arrays;

public class desc_order_algorith {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 23, 47, 1, 5 };
        sording(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] sording(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;

            int maxIndex = getIndex(arr, i, last);
            swap(arr, i, maxIndex);

        }
        return arr;
    }

    static int getIndex(int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;

            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
