package javaoop.lab.library;

import java.time.LocalDate;
import java.util.Scanner;

public class TheMuon {
    private String soPhieuMuon, soHieuSach;
    private SinhVien sinhvien;
    private LocalDate ngayMuon, ngayTra;
    public TheMuon() {
        soPhieuMuon=soHieuSach="";
        sinhvien=new SinhVien();
        ngayMuon=ngayTra=LocalDate.now();
    }
    public TheMuon(String soPhieuMuon, String soHieuSach, SinhVien sinhvien, LocalDate ngayMuon, LocalDate ngayTra) {
        this.soPhieuMuon=soPhieuMuon;
        this.soHieuSach=soHieuSach;
        this.sinhvien=sinhvien;
        this.ngayMuon=ngayMuon;
        this.ngayTra=ngayTra;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon=sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach=sc.nextLine();
        System.out.println("Nhap thong tin cua sinh vien: ");
        sinhvien.nhap();
        System.out.print("Nhap ngay muon: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        ngayMuon=LocalDate.of(c, b, a);
        System.out.print("Nhap ngay tra: ");
        a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
        ngayTra=LocalDate.of(c, b, a);
    }
    public String toString() {
        return "So phieu muon: "+soPhieuMuon+"\nSo hieu sach: "+soHieuSach+sinhvien.toString()+"\nNgay muon: "+ngayMuon.toString()+"\nNgay tra: "+ngayTra.toString();
    }
}
