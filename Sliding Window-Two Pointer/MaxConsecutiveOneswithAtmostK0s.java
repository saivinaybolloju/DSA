//https://leetcode.com/problems/max-consecutive-ones-iii/description/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zc=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)   zc+=1;
            if(zc>k){
                if(nums[left]==0)   zc--;
                left++;
            }
            if(zc<=k)
                maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
