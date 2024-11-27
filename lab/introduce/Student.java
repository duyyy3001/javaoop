package javaoop.lab.introduce;

import java.util.Scanner;

public class Student {
    private String studentCode, studentName, studentSex;
    private int studentAge;
    public Student() {
        studentCode=studentName=studentSex="";
        studentAge=0;
    }
    public Student(String studentCode,String studentName,int studentAge,String studentSex) {
        this.studentAge=studentAge;
        this.studentCode=studentCode;
        this.studentName=studentName;
        this.studentSex=studentSex;
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        studentCode=sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        studentName=sc.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        studentAge=sc.nextInt();
        System.out.print("Nhap gioi tinh cua sinh vien: ");
        sc.nextLine();
        studentSex=sc.nextLine();
    }
    public String toString() {
        return "Ma sinh vien: "+studentCode+"\nHo ten: "+studentName+"\nTuoi: "+studentAge+"\nGioi tinh: "+studentSex;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] a=new Student[n];
        for (int i=0;i<n;i++) {
            a[i]=new Student();
            a[i].input();
        }
        for (int i=0;i<n;i++) System.out.println(a[i].toString());
        sc.close();
    }
}