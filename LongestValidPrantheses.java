class Solution {
    public int longestValidParentheses(String s) {
        int open,close;
        open=close=0;
        int Maxi=0;
        for(Character x:s.toCharArray()){
            if(x=='(')
                open++;
            else
                close++;
            if(open==close)
                Maxi=Math.max(Maxi,open+close);
            else if(close>open)
                open=close=0;
        }
        open=close=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(')
                open++;
            else
                close++;
            if(open==close)
                Maxi=Math.max(Maxi,open+close);
            else if(open>close)
                open=close=0;
        }

        return Maxi;
    }
}
