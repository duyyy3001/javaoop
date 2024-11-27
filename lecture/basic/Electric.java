package javaoop.lecture.basic;

import java.util.Scanner;

public class Electric {
    static final int muc1=1484,muc2=1533,muc3=1786,muc4=2242;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so dien tieu thu: ");
        long a=sc.nextInt();
        long b=0;
        if (a<0) System.out.println("Du lieu khong hop le: ");
        else if (a>=0&&a<=50) b=a*muc1;
        else if (a>50&&a<=100) b=50*muc1+(a-50)*muc2;
        else if (a>100&&a<=200) b=50*muc1+50*muc2+(a-200)*muc2;
        sc.close();
    }
}
