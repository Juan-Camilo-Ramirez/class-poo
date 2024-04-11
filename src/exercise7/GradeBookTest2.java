package exercise7;
public class GradeBookTest2 {
    public static void main(String[] args) {
        GradeBook2 planilla = new GradeBook2("");
        planilla.setCourseName("CS101 INTRODUCTION TO JAVA PROGRAMMING");
        GradeBook2 planilla1 = new GradeBook2("");
        planilla1.setCourseName("CS102 DATA STRUCTURES IN JAVA");

        String message = planilla.displayMessage();
        System.out.println(message);
        String message1 = planilla1.displayMessage();
        System.out.println(message1);
    }
}
