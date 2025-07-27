//https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean flag=true;
        int i=0;
        int j=1;
        while(k>0){
            if(i>=arr.length||arr[i]!=j){
                k--;
                if(k==0){
                    return j;
                }
            }else{
                i++;
            }
            j++;
        }
        return -1;
    }
}
