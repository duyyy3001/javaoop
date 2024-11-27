package javaoop.lecture.classobject.learner;

import java.util.Scanner;

public class HocVienDH extends HocVien {
    protected int donGiaDH;
    public HocVienDH() {
        super();
        donGiaDH=-1;
    }
    public HocVienDH(String hoTen,String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi, int donGiaDH) {
        super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh,soBuoi);
        this.donGiaDH=donGiaDH;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap don gia he dai hoc: ");
        donGiaDH=sc.nextInt();
    }
    public double hocPhi() {
        int u=0;
        if (loaiUuTien==1) u=1000000;
        else u=500000;
        return soBuoi*donGiaDH-u;
    }
}
