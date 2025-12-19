//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    int BinarySearch(int [] arr, int low, int high){
        if(arr[low]<=arr[high]){
            return arr[0];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<high && arr[mid+1]<arr[mid]){
                return arr[mid+1];
            }
            if(mid>low && arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]>=arr[low]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;

    }
    public int findMin(int[] nums) {
        return BinarySearch(nums,0,nums.length-1);
    }
}




class Solution {
    int BinarySearch(int [] arr, int low, int high){
        if(arr[low]<=arr[high]) return arr[low];
        if(high<low)    return -1;
        int mid=low+(high-low)/2;
        if(mid<high && arr[mid+1]<arr[mid]){
            return arr[mid+1];
        }
        if(mid>low && arr[mid]<arr[mid-1]){
            return arr[mid];
        }
        if(arr[mid]>=arr[low]){
            return BinarySearch(arr,mid+1,high);
        }else{
            return BinarySearch(arr,low,mid-1);
        }
    }
    public int findMin(int[] nums) {
        return BinarySearch(nums,0,nums.length-1);
    }
}
