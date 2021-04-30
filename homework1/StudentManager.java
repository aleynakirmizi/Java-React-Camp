package homework1;

public class StudentManager {
    public void add(Student student){
        System.out.println(student.getFirst_name()+" "+student.getLast_name()+" derse eklendi");

    }
    public void delete(Student student){
        System.out.println(student.getStudent_id()+" "+"silindi!");
    }
    public void attend(Student student){
        System.out.println(student.getStudent_id()+" yoklamanız alınmıştır.");
    }
}
