//https://leetcode.com/problems/sum-of-subarray-ranges/

class Solution {
    public long subarrayMins(int[] arr){
        int n=arr.length;
        int psearr[]=new int[n];
        int nsearr[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                psearr[i]=-1;
            }else{
                psearr[i]=st.peek();
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nsearr[i]=n;
            }else{
                nsearr[i]=st.peek();
            }
            st.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            int lc=i-psearr[i];
            int rc=nsearr[i]-i;
            sum = (sum + (1L*arr[i] * lc * rc) );

        }
        return (sum);

    }
    public long subarrayMaxs(int[] arr){
        int n=arr.length;
        int psearr[]=new int[n];
        int nsearr[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                psearr[i]=-1;
            }else{
                psearr[i]=st.peek();
            }
            st.push(i);
        }
        st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nsearr[i]=n;
            }else{
                nsearr[i]=st.peek();
            }
            st.push(i);
        }
        long sum=0;
        
        for(int i=0;i<n;i++){
            int lc=i-psearr[i];
            int rc=nsearr[i]-i;
            sum = (sum + (1L*arr[i] * lc * rc));

        }
        return (sum);

    }
    public long subArrayRanges(int[] nums) {
    
        return (subarrayMaxs(nums) - subarrayMins(nums) );

    }
}
