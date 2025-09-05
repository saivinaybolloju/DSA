//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/hashset-operations

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer>hs1=new TreeSet<>();
        TreeSet<Integer>hs2=new TreeSet<>();
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            hs1.add(sc.nextInt());
        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            hs2.add(sc.nextInt());
        }
        TreeSet<Integer>union=new TreeSet<>(hs1);
        union.addAll(hs2);
        TreeSet<Integer>intersection=new TreeSet<>(hs1);
        intersection.retainAll(hs2);
        TreeSet<Integer>aminusb=new TreeSet<>(union);
        aminusb.removeAll(intersection);
        boolean disjoint=Collections.disjoint(hs1,hs2);
        boolean subset=hs2.containsAll(hs1);
        boolean superset=hs1.containsAll(hs2);
        // System.out.println(union);
        for(int i:union){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:intersection){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:aminusb){
            System.out.print(i+" ");
        }
        System.out.println();
        // System.out.println(intersection);
        // System.out.println(aminusb);
        System.out.println(disjoint);
        System.out.println(subset);
        System.out.println(superset);

    }
}
