//https://leetcode.com/problems/powx-n/

class Solution {
    double powerfn(double x,int n){
        if(n==0)   return 1;
        if(n==1)   return x;
        double temp=powerfn(x,n/2);
        if(n%2==0)  return temp*temp;
        else    return temp*temp*x;
        
    }
    public double myPow(double x, int n) {
        if(n<0)    return(1/(powerfn(x,Math.abs(n))));
        return powerfn(x,n);
    }
}
