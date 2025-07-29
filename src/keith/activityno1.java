import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
     
        System.out.print("Enter marks in Science: ");
        int scienceMarks = scanner.nextInt();
        
        System.out.print("Enter marks in History: ");
        int historyMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Math: ");
        int mathMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Social Studies: ");
        int socialMarks = scanner.nextInt();
        
        System.out.print("Enter marks in Arts: ");
        int artsMarks = scanner.nextInt();
        
    
        int totalMarks = scienceMarks + historyMarks + mathMarks + socialMarks + artsMarks;
        double percentage = (totalMarks / 500.0) * 100; 
        
      
        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
            System.out.println("Try Again!");
        } else if (percentage >= 70 && percentage < 76) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage < 81) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage < 86) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage < 91) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }
        
      
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
        
        if (percentage >= 70) {
            System.out.println("Congrats " + name + " you Passed.");
        }
        
        scanner.close();
    }
}
