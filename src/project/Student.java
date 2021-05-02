package project;

public class Student extends User{
    private String firstName;
    private String Name;
    private String lastName;
    private int id;
    private String university;

    public Student(){ //constructor

    }
    public Student (String FirstName, String lastName, int id, String university){
        this.firstName = FirstName;
        this.lastName = lastName;
        this.id = id;
        this.university = university;

    }


    public String getFirstName(String FirstName) {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
