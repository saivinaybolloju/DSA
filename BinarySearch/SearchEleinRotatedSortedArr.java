//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {

    int BinarySearch(int[] arr, int target, int low, int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)    return mid;
            if(arr[low]<=arr[mid]){
                if(arr[mid]>target && target>=arr[low]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target>arr[mid]&& target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length-1);
    }
}
