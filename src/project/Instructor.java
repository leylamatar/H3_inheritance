package project;

public class Instructor extends User{
    private String firstName;
    private String lastName;
    private String lesson;

    public Instructor(){

    }
    public Instructor (String firstName, String lastName, String lesson){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.lesson = lesson;

    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

}
