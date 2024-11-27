package javaoop.lecture.classobject.diachi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DiaChi a=new DiaChi();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap thon: ");
        String str=sc.nextLine();
        a.setThon(str);
        System.out.print("Nhap xa: ");
        str=sc.nextLine();
        a.setXa(str);
        System.out.print("Nhap huyen: ");
        str=sc.nextLine();
        a.setHuyen(str);
        System.out.print("Nhap tinh: ");
        str=sc.nextLine();
        a.setTinh(str);
        System.out.print(a.toString());
        sc.close();
    }
}