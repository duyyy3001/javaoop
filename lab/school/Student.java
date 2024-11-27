package javaoop.lab.school;

public class Student {
    private int studentId;
    private String studentName, batch;
    private double mark1, mark2;
    public Student() {
        studentId=0;
        studentName=batch="";
        mark1=mark2=0;
    }
    public Student(int studentId, String studentName, String batch, double mark1, double mark2) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.batch=batch;
        this.mark1=mark1;
        this.mark2=mark2;
    }
    public void setStudentID(int a) {
        studentId=a;
    }
    public int getStudentID() {
        return studentId;
    }
    public void setStudentName(String a) {
        studentName=a;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setBatch(String a) {
        batch=a;
    }
    public String getBatch() {
        return batch;
    }
    public void setMark1(double a) {
        mark1=a;
    }
    public double getMark1() {
        return mark1;
    }
    public void setMark2(double a) {
        mark2=a;
    }
    public double getMark2() {
        return mark2;
    }
    public double getAvgMark() {
        return (mark1+mark2)/2;
    }
    public String toString() {
        return "Ma sinh vien: "+studentId+"\nHo ten: "+studentName+"\nKhoa: "+batch+"\nDiem trung binh: "+getAvgMark();
    }
}
