package exercise1;

public class GradeBook {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public GradeBook(String name){}
    public String displayMessage(){
        return "welcome to the gradebook, course name is: " + getCourseName();
    }

}
