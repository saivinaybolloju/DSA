class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int temparr[]=nums.clone();
        int res[]=new int[nums.length];
        Arrays.sort(temparr);
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(temparr[i]))
                hm.put(temparr[i],i);
        }
        for(int i=0;i<nums.length;i++){
            res[i]=hm.get(nums[i]);
        }
        return res;
    }
}
