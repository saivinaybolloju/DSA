//https://leetcode.com/problems/largest-rectangle-in-histogram/

class Solution {
    Stack<Integer>st=new Stack<>();
    
        
    public int[] pse(int []heights){
        st.clear();
        int n=heights.length;
        int[] left = new int[n];
        
        for (int i = 0; i <n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }     
        
        return left;
    }
    
    public int[] nse(int []heights){
        int n=heights.length;
        int[] right = new int[n];
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
           while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        return right;
    }
    public int largestRectangleArea(int[] heights) {
        int[] left = pse(heights);
        int[] right = nse(heights);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
