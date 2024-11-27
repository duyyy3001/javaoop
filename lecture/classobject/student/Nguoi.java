package javaoop.lecture.classobject.student;

public abstract class Nguoi {
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;
    public Nguoi() {
        ten="";
        tuoi=-1;
        gioiTinh=' ';
    }
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }
    public abstract void nhap();
    public void setTen(String a) {
        ten=a;
    }
    public String getTen() {
        return ten;
    }
    public void setTuoi(int a) {
        tuoi=a;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setGioiTinh(char a) {
        gioiTinh=a;
    }
    public char getGioiTinh() {
        return gioiTinh;
    }
    public abstract String toString();
}
