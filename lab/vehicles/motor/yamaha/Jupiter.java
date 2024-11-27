package javaoop.lab.vehicles.motor.yamaha;

import java.util.Scanner;

import JavaOOP.Lab.Assignment6.motor.Motor;

public class Jupiter extends Motor {
    protected int warranty;
    public Jupiter() {
        super();
        warranty=0;
    }
    public Jupiter(String code, String name, double capacity,int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty=warranty;
    }
    public void setWarranty(int a) {
        warranty=a;
    }
    public int getWarranty() {
        return warranty;
    }
    public void inputInfor() {
        super.inputInfor();
        System.out.print("Nhap thoi gian bao hanh: ");
        Scanner sc=new Scanner(System.in);
        warranty=sc.nextInt();
    }
    public void displayInfor() {
        super.displayInfor();
        System.out.print("\nThoi gian bao hanh: "+warranty);
    }
}
