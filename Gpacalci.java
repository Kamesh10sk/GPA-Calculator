import java.util.*;

public class Gpacalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter your Register No: ");
        String Register_No = sc.nextLine();
        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        String[] Grade = new String[n];
        int[] Credits = new int[n];
        int[] Grademarks = new int[n];

        // Get the grades and credits
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Grade for Subject " + (i + 1) + ": ");
            Grade[i] = sc.next();  
            System.out.print("Enter the Credit for Subject " + (i + 1) + ": ");
            Credits[i] = sc.nextInt();
        }
        int totalCredits = 0;
        int totalGrademarks = 0;
        for (int i = 0; i < n; i++) {
            int grademark = 0;
            switch (Grade[i]) { 
                case "O":
                    grademark = 10;
                    break;
                case "A+":
                    grademark = 9;
                    break;
                case "A":
                    grademark = 8;
                    break;
                case "B+":
                    grademark = 7;
                    break;
                case "B":
                    grademark = 6;
                    break;
                case "C":
                    grademark = 5;
                    break;
                default:
                    System.out.println("Invalid Grade Entered for Subject " + (i + 1));
                    grademark = 0;
                    break;
            }
            totalCredits += Credits[i];
            totalGrademarks += grademark * Credits[i];
        }
        double GPA =  totalGrademarks / totalCredits;
        System.out.println("\n--- Final GPA Result ---");
        System.out.println("Name: " + Name);
        System.out.println("Register No: " + Register_No);
        System.out.printf("GPA:%.2f",GPA);
    }
}




