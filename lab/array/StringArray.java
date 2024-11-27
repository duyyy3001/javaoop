package javaoop.lab.array;

import java.util.Scanner;
import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] name = new String[n];
        sc.nextLine();
        for (int i=0;i<n;i++) {
            name[i]=sc.nextLine();
        }
        Arrays.sort(name);
        for (int i=0;i<n;i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }
}