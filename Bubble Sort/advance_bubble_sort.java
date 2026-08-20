import java.util.Arrays;

// অ্যাডভান্সড বাবল সর্ট (Optimized Bubble Sort) অ্যালগরিদম
public class advance_bubble_sort {
    public static void main(String[] args) {
        // সর্ট করার জন্য একটি উদাহরণ অ্যারে
        int[] arr = { 1, 2, 3, 4, 5 };

        // বাবল সর্ট ফাংশন কল করা হচ্ছে
        bubble_sort(arr);

        // সর্টেড অ্যারে আউটপুট হিসেবে প্রিন্ট করা হচ্ছে
        System.out.println(Arrays.toString(arr));
    }

    // বাবল সর্টের ফাংশন (যা একটি সর্টেড অ্যারে রিটার্ন করে)
    public static int[] bubble_sort(int[] arr) {
        int n = arr.length;

        // বাইরের লুপ: অ্যারের উপাদানগুলোকে বারবার চেক করার জন্য (n-1 পাস পর্যন্ত)
        for (int i = 0; i < n - 1; i++) {
            // এই পাসে কোনো সোয়াপ (swap/স্থান পরিবর্তন) হয়েছে কিনা তা ট্র্যাক করার জন্য ফ্ল্যাগ
            boolean swap = false;

            // ভেতরের লুপ: পাশাপাশি উপাদানগুলোর তুলনা করার জন্য
            for (int j = 0; j < n - 1 - i; j++) {
                // যদি বামপাশের উপাদান ডানপাশের উপাদানের চেয়ে বড় হয়, তবে অদলবদল (swap) হবে
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true; // সোয়াপ হয়েছে নির্দেশ করে
                }
            }

            // যদি এই পাসে কোনো সোয়াপ না হয়ে থাকে, তার মানে অ্যারেটি ইতোমধ্যে সর্ট করা আছে
            // তাই অনর্থক লুপ না চালিয়ে আগেই লুপ থেকে বের হয়ে যাওয়া (Optimization)
            if (!swap) {
                break;
            }
        }
        return arr; // সর্টেড অ্যারে রিটার্ন করা
    }
}

