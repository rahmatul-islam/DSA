import java.util.Arrays;

public class leedcode1920{
public static void main(String[] args) {
    int [] nums = {0,2,1,5,3,4};
    int[] result = Solution.buildArray(nums);
    System.out.println(Arrays.toString(result));
}

}
class Solution {
    public static int[] buildArray(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        for (int i = 0; i < nums.length; i++) {
         ans[i]=nums[nums[i]];
         
            
        }
        return ans;
        
    }
    
    
}