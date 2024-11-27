package javaoop.lab.vehicles.vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    protected String color;
    public Car() {
        super();
        color="";
    }
    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color=color;
    }
    public void input() {
        super.input();
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        System.out.print("Nhap mau sac: ");
        color=sc.nextLine();
    }
    public void display() {
        super.display();
        System.out.print("\nMau sac: "+color+"\n");
    }
}
