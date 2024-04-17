package exercise3;

 import java.util.Scanner;
public class classAverage1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        // termination phase
        int average = total / 10; // integer division yields integer result

        // display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}

