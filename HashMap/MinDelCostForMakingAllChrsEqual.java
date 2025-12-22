//https://leetcode.com/problems/minimum-deletion-cost-to-make-all-characters-equal/

class Solution {
    public long minCost(String s, int[] cost) {
        long sum=0;
        HashMap<Character,Long>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            sum+=cost[i];
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0L)+cost[i]);
        }
        long maxi=Long.MAX_VALUE;
        for(Map.Entry<Character, Long> e:hm.entrySet()){
            maxi=Math.min(maxi,sum-e.getValue());
        }
        return maxi;
    }
}
