//https://leetcode.com/problems/maximum-score-of-a-split/description/

class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long prearr[]=new long[n];
        long suffmin[]=new long[n];
        prearr[0]=nums[0];
        suffmin[n-1]=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            prearr[i]=prearr[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            suffmin[i]=Math.min(suffmin[i+1],nums[i+1]);
        }
        long maxi=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            maxi=Math.max(maxi,prearr[i]-suffmin[i]);
        }
        return maxi;
    }
}
