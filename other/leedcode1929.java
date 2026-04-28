

import java.util.Arrays;
public class leedcode1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = Solution.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n*2];
        for (int i = 0; i < n*2; i++) {
            ans[i]=nums[i%n];
            
        }
        return ans;
        
    }
    
}
