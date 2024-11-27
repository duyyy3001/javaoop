package javaoop.lecture.classobject.learner;

public class Test {
    public static void main(String[] args) {
        HocVienDH a=new HocVienDH();
        HocVienLT b=new HocVienLT();
        a.nhapThongTin(); b.nhapThongTin();
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
