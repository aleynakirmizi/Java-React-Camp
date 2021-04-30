package homework1;

public class main {
    public static void main(String[] args) {

        Student student1 = new Student("Aleyna","Kırmızı",19505632,123,"30.04.2021");
        Student student2 = new Student("X","Y",20395681,234,"01.05.2021");
        Instructor instructor1 = new Instructor("Engin","Demiroğ",998,"01.01.2000","1","Java-React");
        User user1 = new User();
        user1.setFirst_name("Aleyna");
        user1.setLast_name("Kırmızı");
        user1.setNationalNumber(123);
        user1.setRegistiration_date("30.04.2021");

        UserManager userManager = new UserManager();
        userManager.singIn(user1);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.attend(student1);
        studentManager.attend(student2);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructor(instructor1);






    }
}
