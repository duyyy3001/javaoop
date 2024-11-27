package javaoop.lab.student;

public class ManageStudentApp {
    public void viewStudent(Student s) {
        System.out.println("Ma sinh vien: "+s.getStudentID()+"\nHo ten: "+s.getStudentName()+"\nDiem trung binh: "+s.getAverageMark());
    }
    
    public static void main(String[] args) {
        
    }
}
