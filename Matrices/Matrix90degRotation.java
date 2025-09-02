//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/rotation-of-matrix

import java.io.*;
import java.util.*;

public class Main {
    static int mat[][];
    public static void reverserows(){
        int n=mat.length;
        for(int i=0;i<n;i++){
            int temp[]=mat[i];
            for(int j=0;j<n/2;j++){
                int aux=temp[j];
                temp[j]=temp[n-j-1];
                temp[n-j-1]=aux;
            }
        }
    }
    public static void swapDiagonalElements(){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[n-j-1][n-i-1];
                mat[n-j-1][n-i-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=1;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            mat=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            reverserows();
            swapDiagonalElements();
            System.out.println("Test Case #"+(k++)+":");
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
