//https://leetcode.com/problems/trapping-rain-water/
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int premax[]=new int[n];
        int sufmax[]=new int[n];
        premax[0]=height[0];
        int maxi=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            maxi=Math.max(premax[i-1],height[i]);
            premax[i]=maxi;
        }
        sufmax[n-1]=height[n-1];
        maxi=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            maxi=Math.max(sufmax[i+1],height[i]);
            sufmax[i]=maxi;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int minh=Math.min(premax[i],sufmax[i]);
            sum+=minh-height[i];
        }
        System.out.println();
        
        return sum;
    }
}
