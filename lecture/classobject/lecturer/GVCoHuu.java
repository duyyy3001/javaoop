package javaoop.lecture.classobject.lecturer;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
    protected double luongCoBan, heSoLuong, thamNien;
    public GVCoHuu() {
        super();
        luongCoBan=heSoLuong=0;
    }
    public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien, double luongCoBan, double heSoLuong) {
        super(hoTen, diaChi, loaiGiangVien);
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
    }
    public void nhapThongTin() {
        super.nhapThongTin();;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap luong co ban: ");
        luongCoBan=sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong=sc.nextDouble();
        System.out.print("Nhap tham niem: ");
        thamNien=sc.nextDouble();
    }
    public double tinhLuong() {
        double pc=0;
        if (thamNien>=5) pc=thamNien/100*luongCoBan;
        return luongCoBan*heSoLuong+pc;
    }
}
