package project;

public class StudentManager extends UserManager{
    public StudentManager(){

    }

    public void List(Student student) {

        System.out.println("First Name:" + student.getName());
        System.out.println("Last Name:" + student.getLastName());
        System.out.println("id:" + student.getId());
        System.out.println("University :" + student.getUniversity());
    }


}
