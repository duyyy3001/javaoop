package javaoop.lecture.basic;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap diem thi cua sinh vien: ");
        int a=sc.nextInt();
        char c;
        if (a>=90&&a<=100) c='A';
        else if (a>=80) c='B';
        else if (a>=70) c='C';
        else if (a>=50) c='D';
        else c='F';
        System.out.println("Xep loai sinh vien: "+c);
        sc.close();
    }
}
