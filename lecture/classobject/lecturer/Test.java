package javaoop.lecture.classobject.lecturer;

public class Test {
    public static void main(String[] args) {
        GVCoHuu a=new GVCoHuu();
        GVThinhGiang b=new GVThinhGiang();
        a.nhapThongTin(); b.nhapThongTin();
        System.out.println(a.toString()+b.toString());
    }
}
