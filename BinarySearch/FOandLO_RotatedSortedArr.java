//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans[0]=mid;
            }
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans[1]=mid;
            }
            if(nums[mid]>target){
                
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return ans;
    }
}
