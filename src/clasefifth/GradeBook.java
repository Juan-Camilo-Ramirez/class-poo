package clasefifth;

public class GradeBook {
    private String courseName;
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public GradeBook(){}
    public String displayMessage(){
        return "welcome to the gradebook, course name is: " + getCourseName();
    }

}
