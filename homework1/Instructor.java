package homework1;

public class Instructor extends User {
    private String InstructorNumber;
    private String GivenCourse;

    public Instructor(String first_name, String last_name, int nationalNumber, String registiration_date,String InstructorNumber,String GivenCourse ){
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setNationalNumber(nationalNumber);
        this.setRegistiration_date(registiration_date);
        this.setInstructorNumber(InstructorNumber);
        this.setGivenCourse(GivenCourse);
    }

    public String getInstructorNumber() {
        return InstructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        InstructorNumber = instructorNumber;
    }

    public String getGivenCourse() {
        return GivenCourse;
    }

    public void setGivenCourse(String GivenCourse) {
        this.GivenCourse = GivenCourse;
    }
}

