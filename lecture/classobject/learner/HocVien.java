package javaoop.lecture.classobject.learner;

import java.util.Scanner;

public abstract class HocVien {
    protected String hoTen, diaChi, loaiChuongTrinh;
    protected int loaiUuTien,soBuoi;
    public HocVien() {
        hoTen=diaChi=loaiChuongTrinh="";
        loaiUuTien=soBuoi=-1;
    }
    public HocVien(String hoTen, String diaChi,int loaiUuTien, String loaiChuongTrinh,int soBuoi) {
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.loaiUuTien=loaiUuTien;
        this.loaiChuongTrinh=loaiChuongTrinh;
        this.soBuoi=soBuoi;
    }
    public void nhapThongTin() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho va ten hoc vien: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap dia chi cua hoc vien: ");
        diaChi=sc.nextLine();
        do{
            System.out.print("Nhap loai uu tien (1 hoac 2): ");
            loaiUuTien=sc.nextInt();
            if (loaiUuTien!=1&&loaiUuTien!=2) System.out.println("Du lieu khong hop le! Vui long nhap lai!");
        }while(loaiUuTien!=1&&loaiUuTien!=2);
        sc.nextLine();
        System.out.print("Nhap loai chuong trinh dang ki: ");
        loaiChuongTrinh=sc.nextLine();
        System.out.print("Nhap so buoi: ");
        soBuoi=sc.nextInt();
    }
    public void setTen(String a) {
        hoTen=a;
    }
    public String getTen() {
        return hoTen;
    }
    public void setDiaChi(String a) {
        diaChi=a;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setLoaiCT(String a) {
        loaiChuongTrinh=a;
    }
    public String getLoaiCT() {
        return loaiChuongTrinh;
    }
    public void setLoaiUT(int a) {
        loaiUuTien=a;
    }
    public int getLoaiUT() {
        return loaiUuTien;
    }
    public int getSoBuoi() {
        return soBuoi;
    }
    public void setSoBuoi(int a) {
        soBuoi=a;
    }
    public abstract double hocPhi();
    public String toString() {
        return "Ho ten: "+hoTen+"\nDia chi: "+diaChi+"\nLoai uu tien: "+loaiUuTien+"\nLoai chuong trinh dang ki hoc: "+loaiChuongTrinh+"\nHoc phi: "+hocPhi();
    }
}
