package javaoop.lab.vehicle;

import java.util.Scanner;

public class XeMay extends PTGT {
    protected int congSuat;
    public XeMay() {
        super();
        congSuat=0;
    }
    public XeMay(String hang, String mau, int giaBan, int namSx, int congSuat) {
        super(hang, mau, giaBan, namSx);
        this.congSuat=congSuat;
    }
    public void setCongSuat(int a) {
        congSuat=a;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap cong suat cua xe: ");
        congSuat=sc.nextInt();
    }
    public String toString() {
        return super.toString()+"\nCong suat: "+congSuat;
    }
}