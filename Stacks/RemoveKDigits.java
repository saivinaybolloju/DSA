//https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character>st=new Stack<>();
        int n=num.length();
        // if(n<=k){
        //     return "0";
        // }
        for(Character c:num.toCharArray()){
            while(!st.isEmpty()&&st.peek()>c&&k-->0){
                st.pop();
            }
            st.push(c);  
        }
        while(k-->0&&!st.isEmpty()){
            st.pop();
        }

        System.out.println(st);
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
