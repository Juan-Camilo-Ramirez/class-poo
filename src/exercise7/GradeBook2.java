package exercise7;

import java.util.Scanner;

    public class GradeBook2 {
    private String courseName;
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public GradeBook2(String name){}
    public String displayMessage(){
        return "welcome to the gradebook, course name is: " + getCourseName();
    }
    public void inputGrades(){

        Scanner keyboard = new Scanner(System.in);
        int Grade=0;

        System.out.println("ingrese las notas");
        while (keyboard.hasNext()) {

            total += Grade;
            ++gradeCounter;
            incrementLetterGradeCounter(Grade);
        }
    }
    private void incrementLetterGradeCounter (int Grade){

    }
}