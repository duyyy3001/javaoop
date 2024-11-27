package javaoop.lecture.classobject.nhanvien;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a=new NhanVien();
        a.inputData();
        System.out.println(a.toString());
        sc.close();
    }
}
