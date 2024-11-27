package javaoop.lab.vehicles.vehicle;

import java.util.Scanner;

public class Vehicle implements IVehicle {
    protected String maker, model;
    protected double price;
    public Vehicle() {
        maker=model="";
        price=0.0f;
    }
    public Vehicle(String maker, String model, double price) {
        this.maker=maker;
        this.model=model;
        this.price=price;
    }
    public void setMaker(String a) {
        maker=a;
    }
    public String getMaker() {
        return maker;
    }
    public void setModel(String a) {
        model=a;
    }
    public String getModel() {
        return model;
    }
    public void setPrice(double a) {
        price=a;
    }
    public double getPrice() {
        return price;
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap hang san xuat: ");
        maker=sc.nextLine();
        System.out.print("Nhap mau ma: ");
        model=sc.nextLine();
        System.out.print("Nhap gia tien: ");
        price=sc.nextDouble();
    }
    public void display() {
        System.out.print("Hang san xuat: "+maker+"\nMau ma: "+model+"\nGia tien: "+price);
    }
}
