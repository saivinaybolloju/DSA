//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
       int n=nums.length;
       int low=0;
       int high=n-1;
       while(low<=high){
        int mid=(low)+(high-low)/2;
        min=Math.min(min,nums[mid]);
        if(nums[mid]>=nums[low]){
            min=Math.min(min,nums[low]);
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return min;
    }
}
