package javaoop.lab.student;

public class Student {
    protected int studentID;
    protected String studentName;
    protected double math,physic,chemistry;
    public Student() {
        studentID=0;
        studentName="";
        math=physic=chemistry=0.0f;
    }
    public Student(int studentID,String studentName,double math, double physic, double chemistry) {
        this.studentID=studentID;
        this.studentName=studentName;
        this.math=math;
        this.physic=physic;
        this.chemistry=chemistry;
    }
    public void setStudentID(int a) {
        studentID=a;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentName(String a) {
        studentName=a;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setMath(double a) {
        math=a;
    }
    public double getMath() {
        return math;
    }
    public void setPhysic(double a) {
        physic=a;
    }
    public double getPhysic() {
        return physic;
    }
    public void setChemistry(double a) {
        chemistry=a;
    }
    public double getChemistry() {
        return chemistry;
    }
    public double getAverageMark() {
        return (math+chemistry+physic)/3;
    }
    public char getRate() {
        double a=getAverageMark();
        if (a>=8.0) return 'A';
        else if (a>=6.5) return 'B';
        else if (a>=5.0) return 'C';
        return 'D';
    }
}
