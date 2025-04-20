class Solution {
    public boolean check(int[] nums) {
        int inverted= (nums[0]<nums[nums.length-1])?1:0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                inverted++;
            }
        }
        return inverted>1?false:true;
    }
}
