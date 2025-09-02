//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/subsets-of-an-array

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
            ans.add(new ArrayList());
            for(int i=0;i<n;i++){
                int size=ans.size();
                for(int j=0;j<size;j++){
                    ArrayList<Integer> subset=new ArrayList<>(ans.get(j));
                    subset.add(arr.get(i));
                    ans.add(subset);
                }
            }
            ans.sort((a,b)->{
                int len=Math.min(a.size(),b.size());
                for(int i=0;i<len;i++){
                    if(!a.get(i).equals(b.get(i))){
                        return a.get(i)-b.get(i);
                    }
                }
                return a.size()-b.size();
            });
            ans.remove(0);//remove from printing of the empty set
            for(ArrayList<Integer> subsets:ans){
                if(subsets.isEmpty()){
                    System.out.println();
                }else{
                    for(int val:subsets){
                        System.out.print(val+" ");
                    }
                    System.out.println();
                }
            }
            
        }
    }
}
