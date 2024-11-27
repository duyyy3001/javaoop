package javaoop.lecture.classobject.person;

public class Person {
    private String name, dob, pob, email, phone;
    private char gender;
    public Person () {
        name=dob=pob=email=phone="";
        gender='0';
    }
    public Person (String name, String dob, String pob, char gender, String email, String phone) {
        this.name=name;
        this.dob=dob;
        this.pob=pob;
        this.gender=gender;
        this.email=email;
        this.phone=phone;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setDob(String dob) {
        this.dob=dob;
    }
    public String getDob() {
        return dob;
    }
    public void setPob(String pob) {
        this.pob=pob;
    }
    public String getPob() {
        return pob;
    }
    public void setGender(char gender) {
        this.gender=gender;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
    public String getPhone() {
        return phone;
    }
    public String toString() {
        return name+" "+dob+" "+pob+" "+gender+" "+email+" "+phone;
    }
}
