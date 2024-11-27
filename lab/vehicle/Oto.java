package javaoop.lab.vehicle;

import java.util.Scanner;

public class Oto extends PTGT {
    protected int soChoNgoi;
    protected String kieuDongCo;
    public Oto() {
        super();
        soChoNgoi=0;
        kieuDongCo="";
    }
    public Oto(String hang, String mau, int giaBan, int namSx, int soChoNgoi, String kieuDongCo) {
        super(hang, mau, giaBan, namSx);
        this.soChoNgoi=soChoNgoi;
        this.kieuDongCo=kieuDongCo;
    }
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so cho ngoi cua xe: ");
        soChoNgoi=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap kieu dong co: ");
        kieuDongCo=sc.nextLine();
    }
    public String toString() {
        return super.toString()+"\nSo cho ngoi: "+soChoNgoi+"\nKieu dong co: "+kieuDongCo;
    }
}