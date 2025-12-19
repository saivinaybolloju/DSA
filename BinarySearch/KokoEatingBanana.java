//https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    boolean isPossible(int[] arr, int hrs, int k){
        long count=0;
        for(int i:arr){
            count+=Math.ceil((double)i/(double)k);
        }
        return(count<=hrs)?true:false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int mincap=1;
        int maxcap=0;
        for(int i: piles){
            maxcap=Math.max(maxcap,i);
        }
        while(mincap<=maxcap){
            int mid=mincap+(maxcap-mincap)/2;
            if(isPossible(piles,h,mid)){
                maxcap=mid-1;
            }else{
                mincap=mid+1;
            }
        }
        return mincap;
    }
}


//-------------------------------------------------------------------

class Solution {
    int BinarySearchOnAns(int nums[],int h,int mincap, int maxcap){
        if(maxcap<mincap)   return mincap;
            int mid=mincap+(maxcap-mincap)/2;
            if(isPossible(nums,h,mid)){
                return BinarySearchOnAns(nums,h,mincap,mid-1);
            }else{
                return BinarySearchOnAns(nums,h,mid+1,maxcap);
            }
    }
    boolean isPossible(int[] arr, int hrs, int k){
        long count=0;
        for(int i:arr){
            count+=Math.ceil((double)i/(double)k);
        }
        return(count<=hrs)?true:false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int mincap=1;
        int maxcap=0;
        for(int i: piles){
            maxcap=Math.max(maxcap,i);
        }
        return BinarySearchOnAns(piles,h,mincap,maxcap);
    }
}

