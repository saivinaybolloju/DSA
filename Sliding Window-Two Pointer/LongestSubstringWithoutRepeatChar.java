//https://leetcode.com/problems/longest-substring-without-repeating-characters/
 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxi=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)))
                l=Math.max(l,hm.get(s.charAt(i))+1);  
            maxi=Math.max(maxi,i-l+1);
            hm.put(s.charAt(i),i);
        }
        return maxi;
    }
}
