//https://leetcode.com/problems/single-element-in-a-sorted-array

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
