import  java.util.Scanner;
public class code_soft_task_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subject : ");
        int subjectNumber = sc.nextInt();

        int totalNumber = 0;

        for (int i = 1; i <= subjectNumber; i++){
            System.out.print("Enter the marks of " + i + " subject : ");
            int marks = sc.nextInt();
            totalNumber = totalNumber + marks;
            System.out.println("\n");
        }


        double averageMarks = (double)totalNumber / subjectNumber;
        String grade = null;
        if (averageMarks > 90){
            grade = "A+";
            System.out.println("GRADE A+");
        }
        else if (averageMarks >= 80) {
            grade = "A";
            System.out.println("GRADE A");
        }
        else if (averageMarks >= 70) {
            grade = "B";
            System.out.println("GRADE B");
        }
        else if (averageMarks >= 60) {
            grade = "C";
            System.out.println("GRADE C");
        }
        else if (averageMarks >= 50) {
            grade = "D";
            System.out.println("GRADE D");
        }
        else {
            grade = "F";
        }

        System.out.println("There are total " + subjectNumber + " subject.");
        System.out.println("Average percent is " + averageMarks);
        System.out.println("Grade " + grade);
        System.out.println("You are fail. Better luck next time");



    }
}
