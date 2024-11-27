package javaoop.lab.resort;

import java.time.LocalDate;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen, ssid;
    protected LocalDate ngaySinh;
    public Nguoi() {
        hoTen=ssid="";
        ngaySinh=LocalDate.now();
    }
    public Nguoi(String hoTen, LocalDate ngaySinh, String ssid) {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.ssid=ssid;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so CCCD: ");
        ssid=sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap lan luot ngay thang nam sinh: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        ngaySinh=LocalDate.of(c, b, a);
    }
    public String toString() {
        return "So CCCD: "+ssid+"\nHo ten: "+hoTen+"\nNgay sinh: "+ngaySinh.toString()+"\n";
    }
}
