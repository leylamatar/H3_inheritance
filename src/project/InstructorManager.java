package project;

public class InstructorManager extends UserManager {
    public InstructorManager (){

    }
    public void list(Instructor instructor){
        System.out.println("First Name:" + instructor.getFirstName());
        System.out.println("Last Name:" + instructor.getLastName());
        System.out.println("lesson : " + instructor.getLesson());

    }
}
