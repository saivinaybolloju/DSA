//https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        if(n==1||n==0)
            return 0;
        int PrimeArray[]=new int[n+1];
        Arrays.fill(PrimeArray,1);
        PrimeArray[0]=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=i*i;j<n+1;j+=i){
                PrimeArray[j]=0;
            }
        }
    int count=0;
        for(int i=2;i<n;i++){
            if(PrimeArray[i]==1){
                count++;
            }
        }
        return count;        
    }
}
