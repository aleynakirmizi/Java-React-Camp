package homework1;

public class Student extends User{
    private int Student_id;

    public Student(String first_name, String last_name, int student_id,int nationalNumber, String registiration_date){
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setStudent_id(student_id);
        this.setNationalNumber(nationalNumber);
        this.setRegistiration_date(registiration_date);
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }
}
