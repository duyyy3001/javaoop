package javaoop.lab.array;
import java.util.Scanner;

public class OneDimensional {
    public static void print(int[] a) {
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]);
            System.out.print(' ');
        }
    }
    public static boolean findValue(int[] a, int x) {
        for (int i=0;i<a.length;i++) {
            if (a[i]==x) return true;
        }
        return false;
    }
    public static int findMaximumValue(int[] a) {
        int max=-1;
        for (int i=0;i<a.length;i++) {
            if (a[i]>max) max=a[i];
        }
        return max;
    }
    public static int sumOfArray(int[] a) {
        int sum=0; 
        for (int i=0;i<a.length;i++) {
            sum+=a[i];
        }       
        return sum;
    }
    public static void bubbleSort(int[] a) {
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if (a[i]<a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        print(a);
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (findValue(a, x)) System.out.println("This value exists in array");
        else System.out.println("This value does not exist in array");
        System.out.println("\n"+findMaximumValue(a));
        System.out.println(sumOfArray(a));
        bubbleSort(a);
        print(a);
        System.out.println("Choose a function: ");
        System.out.println("1-Print Array.");
        System.out.println("2-Search a member.");
        System.out.println("3-Find Maximum Number.");
        while (true) {
            System.out.println("Enter your number: ");
            int n=sc.nextInt();
            if (n==1) print(a);
            else if (n==2) {
                System.out.println("Enter a value to search: ");
                int s=sc.nextInt();
                if (findValue(a, s)) System.out.print("sc");
            }
            else if (n==3) findMaximumValue(a);
            else break;
        }
        sc.close();
    }
}