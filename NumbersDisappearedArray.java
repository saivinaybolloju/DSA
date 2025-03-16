class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int countarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            countarr[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(countarr[i]==0){
                ar.add(i+1);
            }
        }
        return ar;
    }
