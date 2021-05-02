package project;

public class Main {


    public static void main(String[] args) {

        Student student = new Student();


        student.setName("Leyla");
        student.setLastName("Matar");
        student.setId(123);
        student.setUniversity("Banü");

        StudentManager studentManager = new StudentManager();
        studentManager.List(student);
        System.out.println("-----------------------------");

        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setLesson("Java & React");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.list(instructor);
        System.out.println("-----------------------------");

        System.out.println("yeni Kullanıcı eklendi");
        
        User user1 = new User("ferah ", "matar ",746);


        UserManager userManager = new UserManager();
        userManager.Add(user1);
        System.out.println("-----------------------------");

        userManager.delete(user1);

    }
}
