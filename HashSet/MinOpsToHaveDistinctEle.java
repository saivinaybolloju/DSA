//https://leetcode.com/problems/minimum-number-of-operations-to-have-distinct-elements/description/

class Solution {
    public int minOperations(int[] nums) {
        HashSet<Integer>hm=new HashSet<>();
        int idx=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(hm.contains(nums[i])){
                idx=i;
                break;
            }
            hm.add(nums[i]);
        }
        idx=idx+1;
        int res=(idx%3==0)?(idx/3):(idx/3)+1;
        return res;
    }
}
