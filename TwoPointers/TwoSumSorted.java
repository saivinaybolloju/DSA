//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int n=numbers.length;
        int p1=0;
        int p2=n-1;
        while(p1<p2){
            if(numbers[p1]+numbers[p2]>target){
                p2--;
            }
            else if(numbers[p1]+numbers[p2]<target){
                p1++;
            }
            else{
                ans[0]=p1++;
                ans[1]=p2--;

            }
        }
        //return 1 based index so add 1
        ans[0]+=1;
        ans[1]+=1;
        return ans;
    }
}
