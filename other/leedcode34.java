public class leedcode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result=Solution.searchRange(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
    
}
class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end) { 
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return new int[]{mid-1,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
