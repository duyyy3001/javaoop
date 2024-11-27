package javaoop.lab.array;

import java.util.Scanner;
import java.util.Arrays;

public class TwoDimensional {
    public static void printArray(int[][] a) {
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sumOfArray(int[][] a) {
        int sum=0;
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static boolean findValue(int[][] a, int x) {
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                if (a[i][j]==x) return true;
            }
        }
        return false;
    }
    public static void sort(int[][] a) {
        for (int i=0;i<a.length;i++) {
            Arrays.sort(a[i],0,a[i].length-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        sort(a);
        printArray(a);
        sc.close();
    }
}
