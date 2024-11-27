package javaoop.lecture.classobject.employee;

import java.util.Scanner;

public class Person {
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;
    public Person () {
        ten="";
        tuoi=-1;
        gioiTinh=' ';
    }
    public Person (String ten, int tuoi, char gioiTinh) {
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten=sc.nextLine();
        do {
            System.out.print("Nhap tuoi: ");
            tuoi=sc.nextInt();
            if (tuoi<18) System.out.println("Chua du tuoi lao dong!");
            else if (tuoi>65) System.out.println("Da qua tuoi lao dong!");
        } while(tuoi<18||tuoi>65);
        do {
            System.out.print("Nhap gioi tinh (nam:M, nu: F): ");
            gioiTinh=sc.next().charAt(0);
            if (gioiTinh!='M'&&gioiTinh!='F') System.out.println("Du lieu khong hop le. Vui long nhap lai!");
        } while(gioiTinh!='M'&&gioiTinh!='F');
    }
    public void setTen(String a) {
        ten=a;
    }
    public String getTen() {
        return ten;
    }
    public void setTuoi(int a) {
        tuoi=a;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setGioiTinh(char a) {
        gioiTinh=a;
    }
    public char getGioiTinh() {
        return gioiTinh;
    }
    public String toString() {
        String s;
        if (gioiTinh=='M') s="Nam";
        else s="Nu";
        return "Ten: "+ten+"\nTuoi: "+tuoi+"\nGioi Tinh: "+s;
    }
}