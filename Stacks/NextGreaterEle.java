//https://leetcode.com/problems/next-greater-element-i/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<Integer>();
        int n=nums1.length;
        int m=nums2.length;
        int stkarr[]=new int[m];
        stkarr[m-1]=-1;
        st.push(nums2[m-1]);
        for(int i=m-2;i>=0;i--){
            while(!st.isEmpty()&&nums2[i]>st.peek())
                st.pop();
            if(st.isEmpty())
                stkarr[i]=-1;
            else
                stkarr[i]=st.peek();
            st.push(nums2[i]);
        }

        for(int i=0;i<m;i++){
            System.out.println(stkarr[i]+" ");
        }

        int ans[]=new int[n];
         for(int i=0;i<n;i++){
           int p=0;
           while(nums1[i]!=nums2[p]){
                p++;
            }
            ans[i]=stkarr[p];          
        }
        return ans;
    }
}
