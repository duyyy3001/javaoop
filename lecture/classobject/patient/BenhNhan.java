package javaoop.lecture.classobject.patient;

import java.util.Scanner;

import javaoop.lecture.classobject.employee.Person;

public class BenhNhan extends Person {
    private String tienSu, chanDoan;
    private BenhVien benhVien;
    public BenhNhan() {
        super();
        tienSu=chanDoan="";
        benhVien=new BenhVien();
    }
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu=tienSu;
        this.chanDoan=chanDoan;
        benhVien=new BenhVien();
        this.benhVien=benhVien;
    }
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.print("Nhap tieu su:");
        tienSu=sc.nextLine();
        System.out.println("Nhap chan doan:");
        chanDoan=sc.nextLine();
        benhVien.nhap();
        sc.close();
    }
    public void setTienSu(String a) {
        tienSu=a;
    }
    public String getTienSu() {
        return tienSu;
    }
    public void setChanDoan(String a) {
        chanDoan=a;
    }
    public String getChanDoan() {
        return chanDoan;
    }
    public void setBenhVien(BenhVien a) {
        benhVien=a;
    }
    public BenhVien getBenhVien() {
        return benhVien;
    }
    public String toString() {
        return super.toString()+tienSu+" "+chanDoan+" "+benhVien.toString();
    }
}
