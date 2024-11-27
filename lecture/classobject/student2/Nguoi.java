package javaoop.lecture.classobject.student2;

import java.util.Scanner;

public abstract class Nguoi {
    protected String hoTen,ngaySinh,diaChi,loaiSinhVien;
    protected double tongDiem,soMon;
    public Nguoi() {
        hoTen=ngaySinh=diaChi=loaiSinhVien="";
    }
    public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.diaChi=diaChi;
        this.loaiSinhVien=loaiSinhVien;
    }
    public void nhapThongTin() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh=sc.nextLine();
        System.out.print("Nhap loai sinh vien: ");
        loaiSinhVien=sc.nextLine();
        System.out.print("Nhap tong diem kiem tra: ");
        tongDiem=sc.nextDouble();
        System.out.print("Nhap so mon kiem tra: ");
        soMon=sc.nextDouble();
    }
    public abstract double tinhDiem();
    public String toString() {
        return "Ho ten: "+hoTen+"\nDia chi: "+diaChi+"\nNgay sinh: "+ngaySinh+"\nDiem trung binh: "+tinhDiem();
    }
}
