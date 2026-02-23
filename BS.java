public class BS {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target=5;
        int ans=searchInsert(nums,target);
        System.out.println(ans);
        
    }
    public static int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if (target>nums[mid]) {
                l=mid+1;
                
            }
            else if (target<nums[mid]) {
                r=mid-1;
                
            }else{
                return mid;
            }


        }
        return -1;

    }
        
    }

