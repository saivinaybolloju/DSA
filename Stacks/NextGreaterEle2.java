//https://leetcode.com/problems/next-greater-element-ii/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<Integer>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty()&&nums[i%n]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n]=-1;
            }
            else ans[i%n]=st.peek();
        
            st.push(nums[i%n]);
        }
        return ans;
    }
}
