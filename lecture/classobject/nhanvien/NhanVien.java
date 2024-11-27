package javaoop.lecture.classobject.nhanvien;

import java.util.Scanner;

import javaoop.lecture.classobject.diachi.*;

public class NhanVien {
    private String name, dob;
    private DiaChi address;
    private char gender;
    public NhanVien () {
        name=dob="";
        gender=' ';
        address=new DiaChi();
    }
    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name=name;
        address = new DiaChi();
        this.address=address;
        this.dob=dob;
        this.gender=gender;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten :");
        name=sc.nextLine();
        System.out.println("Nhap dia chi");
        address.inputData();
        System.out.print("Nhap ngay sinh :");
        dob=sc.nextLine();
        System.out.print("Nhap gioi tinh :");
        gender=sc.next().charAt(0);
        sc.close();
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(DiaChi address) {
        this.address=address;
    }
    public DiaChi getAddress() {
        return address;
    }
    public void setGender(char gender) {
        this.gender=gender;
    }
    public char getGender() {
        return gender;
    }
    public void setDob(String dob) {
        this.dob=dob;
    }
    public String getDob() {
        return dob;
    }
    public String toString() {
        return name+" "+address.toString()+" "+dob+" "+gender;
    }
}
