//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

class Solution {
    int countFreq(int[] nums, int target) {
        int fi=-1;
        int li=-1;
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                fi=mid;
                
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
                li=mid;
            }
            if(nums[mid]>target){
                
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        if (fi == -1) return 0;
        return li-fi+1;
    }
}
