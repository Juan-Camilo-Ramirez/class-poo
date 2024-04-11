package exercise1;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook planilla = new GradeBook("");
        planilla.setCourseName("CS101 INTRODUCTION TO JAVA PROGRAMMING");
        GradeBook planilla1 = new GradeBook("");
        planilla1.setCourseName("CS102 DATA STRUCTURES IN JAVA");

        String message = planilla.displayMessage();
        System.out.println(message);
        String message1 = planilla1.displayMessage();
        System.out.println(message1);
    }
}


