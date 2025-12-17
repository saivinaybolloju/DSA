//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

class Solution {
    boolean BinarySearch(int[] arr, int target, int low,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)    return true;
            if(arr[mid]==arr[low]&&arr[high]==arr[mid]){
                low++;
                high--;
                continue;
            }
            if(arr[mid]<=arr[high]){
                if(target>=arr[mid]&&target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else{
                if(target<=arr[mid]&&target>=arr[low]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length-1);
    }
}



//Recursion
class Solution {
    boolean BinarySearch(int[] arr, int target, int low,int high){
        if(high<low)   return false;
        int mid=low+(high-low)/2;
        if(arr[mid]==target)    return true;
        if(arr[mid]==arr[low]&&arr[high]==arr[mid]){
            return BinarySearch(arr, target,low+1,high-1);
        }
        if(arr[mid]<=arr[high]){
            if(target>=arr[mid]&&target<=arr[high]){
                return BinarySearch(arr, target,mid+1,high);
            }else{
                return BinarySearch(arr, target,low,mid-1);
            }
        }else{
            if(target<=arr[mid]&&target>=arr[low]){
                return BinarySearch(arr, target,low,mid-1);
            }else{
                return BinarySearch(arr, target,mid+1,high);
            }

        }
    }
    public boolean search(int[] nums, int target) {
        return BinarySearch(nums,target,0,nums.length-1);
    }
}
