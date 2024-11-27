package javaoop.lab.vehicle;

import java.util.Scanner;

public class XeTai extends PTGT {
    protected int trongTai;
    public XeTai() {
        super();
        trongTai=0;
    }
    public XeTai(String hang, String mau, int giaBan, int namSx, int trongTai) {
        super(hang, mau, giaBan, namSx);
        this.trongTai=trongTai;
    }
    public void setTrongTai(int a) {
        trongTai=a;
    }
    public int getTrongTai() {
        return trongTai;
    }
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap trong tai cua xe: ");
        trongTai=sc.nextInt();
    }
    public String toString() {
        return super.toString()+"\nTrong tai: "+trongTai;
    }
}
