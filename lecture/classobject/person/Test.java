package javaoop.lecture.classobject.person;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person a=new Person();
        System.out.print("Nhap ten: ");
        String str=sc.nextLine();
        a.setName(str);
        System.out.print("Nhap ngay sinh: ");
        str=sc.nextLine();
        a.setDob(str);
        System.out.print("Nhap noi sinh: ");
        str=sc.nextLine();
        a.setPob(str);
        System.out.print("Nhap gioi tinh: ");
        char c=sc.next().charAt(0);
        a.setGender(c);
        sc.nextLine();
        System.out.print("Nhap email: ");
        str=sc.nextLine();
        a.setEmail(str);
        System.out.print("Nhap SDT: ");
        str=sc.nextLine();
        a.setPhone(str);
        System.out.print(a.toString());
        sc.close();
    }
}
