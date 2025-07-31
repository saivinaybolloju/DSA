//https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        int n = asteroids.length;
        
        for(int i=0;i<n;i++){
            int f=0;
            while(!st.isEmpty()&&asteroids[i]<0&&Math.abs(asteroids[i])>Math.abs(st.peek())&& st.peek()>0){
                st.pop();
            }
            if(!st.isEmpty() &&asteroids[i]<0&& Math.abs(asteroids[i])<st.peek()&& st.peek()>0){
                    continue;
            }
            if(!st.isEmpty()&&asteroids[i]<0 && Math.abs(asteroids[i])==Math.abs(st.peek())&&st.peek()>0){
                st.pop();
                f=1;
            }
            if(f!=1)    st.push(asteroids[i]);
            
        }
        System.out.println(st);
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.peek();
            st.pop();
        }
        return ans;
    }
}
