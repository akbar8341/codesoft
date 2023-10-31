import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Step 1: Take input for marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numsubjects = scanner.nextInt();
        int totalmarks = 0;

        for (int i = 1; i <= numsubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalmarks += marks;
        }
        double averagepercentage=totalmarks/numsubjects;
        String grade;
        if (averagepercentage >= 90) {
            grade = "A+";
        } else if (averagepercentage >= 75) {
            grade = "A";
        } else if (averagepercentage >= 60) {
            grade = "B";
        } else if (averagepercentage >= 45) {
            grade = "C";
        } else if (averagepercentage >= 33) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks:" + " " + totalmarks);
        System.out.println("Average Percentage :" + " " + averagepercentage);
        System.out.println("Grade :" + " " + grade);
        }

    }
    

