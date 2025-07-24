//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/list-operations

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>ar=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0){
            String val=sc.next();
            if(val.equals("append")){
                ar.add(sc.nextInt());
                for(int x:ar){System.out.print(x+" ");}
                System.out.println();
            }else if(val.equals("insert")){
                int ele=sc.nextInt();
                int pos=sc.nextInt();
                ar.add(ele,pos);
                for(int x:ar){System.out.print(x+" ");}
                System.out.println();
            }else if(val.equals("extend")){
                ar.addAll(ar);
                for(int x:ar){System.out.print(x+" ");}
                System.out.println();
            }else if(val.equals("sort")){
                Collections.sort(ar);
                for(int x:ar){System.out.print(x+" ");}
                System.out.println();
            }else if(val.equals("index")){
                int k=sc.nextInt();int f=0;
                for(int i=0;i<ar.size();i++){
                    if(ar.get(i)==k){
                        System.out.println(i);
                        f=1;
                        break;
                    }
                }
                if(f==0)
                    System.out.println(-1);

            }else if(val.equals("length")){
                System.out.println(ar.size());
            }else if(val.equals("count")){
                int c=0;
                int ele=sc.nextInt();
                for(int i:ar){
                    if(i==ele){
                        c++;
                    }
                }
                System.out.println(c);
            }else if(val.equals("reverse")){
                Collections.reverse(ar);
               for(int x:ar){System.out.print(x+" ");}
                System.out.println();
            }
        }
        
    }
}
