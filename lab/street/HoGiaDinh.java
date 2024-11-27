package javaoop.lab.street;

import java.util.Scanner;

public class HoGiaDinh {
    protected int soNguoi,soNha;
    protected Nguoi[] nguoi;
    public HoGiaDinh() {
        soNguoi=2;
        soNha=0;
        nguoi=new Nguoi[soNguoi];
    }
    public HoGiaDinh(int soNguoi,int soNha,Nguoi[] nguoi) {
        this.soNguoi=soNguoi;
        this.soNha=soNha;
        this.nguoi=nguoi;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguoi: ");
        soNguoi=sc.nextInt();
        for(int i=0;i<nguoi.length;i++) {
            System.out.println("Nhap thong tin cho nguoi thu "+(i+1));
            nguoi[i]=new Nguoi();
            nguoi[i].nhap();
        }
        System.out.print("Nhap so nha: ");
        soNha=sc.nextInt();
    }
    public Nguoi[] getNguoi() {
        return nguoi; 
    }
    public int getSoNguoi() {
        return soNguoi;
    }
    public String toString() {
        String a="";
        for (int i=0;i<soNguoi;i++) {
            a+=nguoi[i].toString();
        }
        return "So nha: "+soNha+"\nSo nguoi: "+soNguoi+"\n"+a;
    }
}
