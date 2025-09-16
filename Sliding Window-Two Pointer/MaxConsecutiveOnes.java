//https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                
            }else{
                maxi=Math.max(c,maxi);
                c=0;
            }
        }
        maxi=Math.max(c,maxi);
        return maxi;
    }
}
