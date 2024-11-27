package javaoop.lab.street;

import java.util.Scanner;
import java.time.*;

public class Nguoi {
    protected String hoTen,ngheNghiep;
    protected LocalDate ngaySinh;
    public Nguoi() {
        hoTen=ngheNghiep="";
        ngaySinh=LocalDate.now();
    }
    public Nguoi(String hoTen,LocalDate ngaySinh, String ngheNghiep) {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.ngheNghiep=ngheNghiep;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap ngay, thang, nam sinh: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        ngaySinh=LocalDate.of(c, b, a);
        System.out.println("Nhap nghe nghiep: ");
        sc.nextLine();
        ngheNghiep=sc.nextLine();
    }
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public int getTuoi(LocalDate dob) {
        if (dob!=null) return Period.between(dob, LocalDate.now()).getYears();
        return 0;
    }
    public String toString() {
        return "Ho ten: "+hoTen+"\nNgay sinh: "+ngaySinh.toString()+"\nNghe nghiep: "+ngheNghiep+"\n";
    }
}
