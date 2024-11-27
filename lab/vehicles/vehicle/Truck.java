package javaoop.lab.vehicles.vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    private int truckload;
    public Truck() {
        super();
        truckload=0;
    }
    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload=truckload;
    }
    public void input() {
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap trong tai: ");
        truckload=sc.nextInt();
    }
    public void display() {
        super.display();
        System.out.print("\nTrong tai : "+truckload+"\n");
    }
}
