package javaoop.lecture.classobject.employee;

import java.util.Scanner;
import java.util.Date;

public class Employee extends Person {
    protected String insurrenceID;
    protected int salary;
    protected Date birthOfDate;
    public Employee() {
        super();
        insurrenceID="";
        salary=-1;
        birthOfDate=new Date();
    }
    public Employee(String ten, int tuoi, char gioiTinh,String insurrenceID, int salary, Date birthOfDate) {
        super(ten, tuoi, gioiTinh);
        this.salary=salary;
        this.insurrenceID=insurrenceID;
        this.birthOfDate=birthOfDate;
    }
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma bao hiem: ");
        insurrenceID=sc.nextLine();
        System.out.print("Nhap tien luong: ");
        salary=sc.nextInt();
    }
    public void setinsurrenceID(String a) {
        insurrenceID=a;
    }
    public String getinsurrenceID() {
        return insurrenceID;
    }
    public void setsalary(int a) {
        salary=a;
    }
    public int getsalary() {
        return salary;
    }
    public String toString() {
        return super.toString()+"\nMa bao hiem: "+insurrenceID+"\nLuong: "+salary;
    }
}
