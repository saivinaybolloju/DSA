class Solution {
    int[][][] memo;
    int[] countOfZerosOnes(String str){
        int count[]=new int[2];
        for(char c:str.toCharArray()){
            if(c=='0'){
                count[0]++;
            }else{
                count[1]++;
            }
        }
        return count;
    }
    int findAnswer(String[]strs, int idx, int m, int n, int[][]zeroOnes){
        if(idx==strs.length) return 0;
        if(memo[idx][m][n]!=-1) return memo[idx][m][n];
        int zeros=zeroOnes[idx][0];
        int ones=zeroOnes[idx][1];

        int notTake=findAnswer(strs,idx+1,m,n,zeroOnes);
        int Take=0;
        if(m>=zeros&&n>=ones){
            Take=1+findAnswer(strs,idx+1,m-zeros,n-ones,zeroOnes);
        }
        memo[idx][m][n]=Math.max(Take,notTake);
        return memo[idx][m][n];
    }
    
    public int findMaxForm(String[] strs, int m, int n) {
        memo=new int[strs.length][m+1][n+1];
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<=m;j++){
                for(int k=0;k<=n;k++){
                    memo[i][j][k]=-1;
                }
            }
        }
        int zeroOnes[][]=new int[strs.length][2];
        for(int i=0;i<strs.length;i++){
            zeroOnes[i]=countOfZerosOnes(strs[i]);
        }

        return findAnswer(strs,0,m,n,zeroOnes);
    }
}
