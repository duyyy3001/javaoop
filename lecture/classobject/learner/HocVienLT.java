package javaoop.lecture.classobject.learner;

import java.util.Scanner;

public class HocVienLT extends HocVien {
    protected int donGiaLT;
    public HocVienLT() {
        super();
        donGiaLT=-1;
    }
    public HocVienLT(String hoTen,String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi, int donGiaLT) {
        super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh,soBuoi);
        this.donGiaLT=donGiaLT;
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap don gia he lien thong: ");
        donGiaLT=sc.nextInt();
    }
    public double hocPhi() {
        int u;
        if (loaiUuTien==1) u=1000000;
        else u=800000;
        return soBuoi*donGiaLT-u;
    }
}
