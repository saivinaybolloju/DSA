//https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2) return s;
        String res="";
        int maxi=0;
        for(int i=0;i<n;i++){
            int p1=i;
            int p2=i;
            while(p1>=0&&p2<n&&s.charAt(p1)==s.charAt(p2)){
                if((p2-p1+1)>maxi){
                        maxi=p2-p1+1;
                        System.out.println(res);
                        res=s.substring(p1,p2+1);
                }
                p1--;
                p2++;
            }
        }
        for(int i=0;i<n-1;i++){
            int p1=i;
            int p2=i+1;
            while(p1>=0&&p2<n&&s.charAt(p1)==s.charAt(p2)){
                if((p2-p1+1)>maxi){
                    maxi=p2-p1+1;
                    System.out.println(res);
                    res=s.substring(p1,p2+1);
                }
                p1--;
                p2++;
            }
        }
        return res;
        
    }
}
