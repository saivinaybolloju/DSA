//https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int left=0,right=0;
        int maxLen=0;
        while(right<fruits.length){
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            if(hm.size()>2){
                hm.put(fruits[left],hm.get(fruits[left])-1);
                if(hm.get(fruits[left])==0){hm.remove(fruits[left]);}
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
