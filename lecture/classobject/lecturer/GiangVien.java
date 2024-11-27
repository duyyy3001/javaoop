package javaoop.lecture.classobject.lecturer;

import java.util.Scanner;

public abstract class GiangVien {
    protected String hoTen,diaChi,loaiGiangVien;
    public GiangVien() {
        hoTen=diaChi=loaiGiangVien="";
    }
    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.loaiGiangVien=loaiGiangVien;
    }
    public void nhapThongTin() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.print("Nhap loai giang vien: ");
        loaiGiangVien=sc.nextLine();
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
    public void setLoaiGV(String a) {
        loaiGiangVien=a;
    }
    public String getLoaiGiangVien() {
        return loaiGiangVien;
    }
    public abstract double tinhLuong();
    public String toString() {
        return "Ho ten: "+hoTen+"\nDia chi: "+diaChi+"\nLoai giang vien: "+loaiGiangVien+"\nLuong thang: "+tinhLuong()+"\n";
    }
}
