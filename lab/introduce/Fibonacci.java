package javaoop.lab.introduce;

public class Fibonacci {
    public static void main(String[] args) {
        long[] fibo=new long[20];
        fibo[0]=0; fibo[1]=1;
        for (int i=2;i<20;i++) fibo[i]=fibo[i-1]+fibo[i-2];
        for (int i=0;i<20;i++) {
            System.out.print(fibo[i]);
            System.out.print(' ');
        }
    }
}
