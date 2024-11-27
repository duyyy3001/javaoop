package javaoop.lab.vehicles.motor;

import java.util.Scanner;

public class Motor implements IMotor {
    protected String code,name;
    protected double capacity;
    protected int num;
    public Motor() {
        code=name="";
        capacity=0;
        num=0;
    }
    public Motor(String code, String name, double capacity, int num) {
        this.code=code;
        this.name=name;
        this.num=num;
        this.capacity=capacity;
    }
    public void setCode(String a) {
        code=a;
    }
    public String getCode() {
        return code;
    }
    public void setName(String a) {
        name=a;
    }
    public String getName() {
        return name;
    }
    public void setCapacity(double a) {
        capacity=a;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setNum(int a) {
        num=a;
    }
    public int getNum() {
        return num;
    }
    public void inputInfor() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma xe: ");
        code=sc.nextLine();
        System.out.print("Nhap ten xe: ");
        name=sc.nextLine();
        System.out.print("Nhap dung tich xi lanh: ");
        capacity=sc.nextDouble();
        System.out.print("Nhap kieu truyen luc: ");
        num=sc.nextInt();
    }
    public void displayInfor() {
        System.out.print("Ma xe: "+code+"\nTen xe: "+name+"\nDung tich xi lanh: "+capacity+"\nKieu truyen luc: "+num);
    }
    public void changeInfor() {

    }
}
