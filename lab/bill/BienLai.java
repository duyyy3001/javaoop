package javaoop.lab.bill;

import java.util.Scanner;

public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu,chiSoMoi;
    public BienLai() {
        khachHang=new KhachHang();
        chiSoCu=chiSoMoi=0;
    }
    public BienLai(KhachHang khachHang,int chiSoCu, int chiSoMoi) {
        this.khachHang=khachHang;
        this.chiSoCu=chiSoCu;
        this.chiSoMoi=chiSoMoi;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thong tin cho khach hang: ");
        khachHang.nhap();
        System.out.print("Nhap chi so cu: ");
        chiSoCu=sc.nextInt();
        System.out.print("Nhap chi so moi: ");
        chiSoMoi=sc.nextInt();
    }
    public void setKhach(KhachHang a) {
        khachHang=a;
    }
    public KhachHang getKhach() {
        return khachHang;
    }
    public void setChiSoCu(int a) {
        chiSoCu=a;
    }
    public int getChiSoCu() {
        return chiSoCu;
    }
    public void setChiSoMoi(int a) {
        chiSoMoi=a;
    }
    public int getChiSoMoi() {
        return chiSoMoi;
    }
    public int tinhTien() {
        return (chiSoMoi-chiSoCu)*750;
    }
    public String toString() {
        return khachHang.toString()+"\n+Chi so cu: "+chiSoCu+"\nChi so moi: "+chiSoMoi+"\nTien dien: "+tinhTien();
    }
}
