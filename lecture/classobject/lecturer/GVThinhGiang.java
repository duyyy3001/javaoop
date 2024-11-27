package javaoop.lecture.classobject.lecturer;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
    protected double soTiet,donGia;
    public GVThinhGiang() {
        super();
        soTiet=donGia=0;
    }
    public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVien, double soTiet, double donGia) {
        super(hoTen, diaChi, loaiGiangVien);
        this.soTiet=soTiet;
        this.donGia=donGia;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap so tiet day: ");
        Scanner sc=new Scanner(System.in);
        soTiet=sc.nextDouble();
        System.out.print("Nhap don gia: ");
        donGia=sc.nextDouble();
    }
    public double tinhLuong() {
        return 0.85*soTiet*donGia;
    }
}
