package javaoop.lecture.classobject.student;

public class Test {
    public static void main(String[] args) {
        SinhVien a=new SinhVien();
        a.nhap();
        System.out.println(a.toString());
        Truong b=new Truong();
        b.nhap();
        a.setTruong(b);
        System.out.println(a.toString());
    }
}
