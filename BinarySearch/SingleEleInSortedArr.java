//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(arr.length==1)   
            return arr[0];
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int low=1;
        int high=n-2;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid]==arr[mid-1]){
                if(mid%2==0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }    
            }else{
                if(mid%2!=0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}



























//----------------------------------------------------------------------------------
class Solution {
    int BinarySearch(int[] nums, int low, int high){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            return nums[mid];
        }
        if(nums[mid]==nums[mid-1]){
            if(mid%2==0){
                return BinarySearch(nums,low,mid-1);
            }else{
                return BinarySearch(nums,mid+1,high);
            }
        }else{
            if(mid%2==0){
                return BinarySearch(nums,mid+1,high);
            }else{
                return BinarySearch(nums,low,mid-1);
            }
        }
    }
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(nums.length==1)   return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        return BinarySearch(nums,1, nums.length-2);
    }
}
