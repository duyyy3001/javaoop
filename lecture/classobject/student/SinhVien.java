package javaoop.lecture.classobject.student;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String lop, nganh;
    private Truong truong;
    public SinhVien () {
        super();
        lop=nganh="";
        truong=new Truong();
    }
    public SinhVien (String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop=lop;
        this.nganh=nganh;
        truong=new Truong();
        this.truong=truong;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten:");
        ten=sc.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi=sc.nextInt();
        do{
            System.out.print("Nhap gioi tinh (nam:M, nu:F):");
            gioiTinh=sc.next().charAt(0);
            if (gioiTinh!='M'&&gioiTinh!='F') System.out.println("Du lieu khong hop le, vui long nhap lai!");
        } while(gioiTinh!='M'&&gioiTinh!='F');
        sc.nextLine();
        System.out.print("Nhap lop:");
        lop=sc.nextLine();
        System.out.print("Nhap nganh:");
        nganh=sc.nextLine();
        truong.nhap();
    }
    public void setLop(String a) {
        lop=a;
    }
    public String getLop() {
        return lop;
    }
    public void setNganh(String a) {
        nganh=a;
    }
    public String getNganh() {
        return nganh;
    }
    public void setTruong(Truong a) {
        truong=a;
    }
    public Truong getTruong() {
        return truong;
    }
    public String toString() {
        return ten+" "+tuoi+" "+gioiTinh+" "+lop+" "+nganh+" "+truong.toString();
    }
}
