package javaoop.lecture.classobject.employee;

import java.util.Scanner;
import java.util.Date;

public class PartTimeEmployee extends Employee {
    private int hourPerWeek;
    public PartTimeEmployee () {
        hourPerWeek=0;
    }
    public PartTimeEmployee(String ten, int tuoi, char gioiTinh,String insurrenceID, int salary, Date birthOfDate, int hourPerWeek) {
        super(ten, tuoi, gioiTinh, insurrenceID, salary,birthOfDate);
        this.hourPerWeek=hourPerWeek;
    }
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so gio lam trong tuan:");
        Scanner sc=new Scanner(System.in);
        hourPerWeek=sc.nextInt();
        sc.nextLine();
    }
    public void setHourPerWeek(int a) {
        hourPerWeek=a;
    }
    public int getHourPerWeek() {
        return hourPerWeek;
    }
    public String toString() {
        return super.toString()+"\nSo gio lam: "+hourPerWeek;
    }
}
