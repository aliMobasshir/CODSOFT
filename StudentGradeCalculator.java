import java.util.Scanner;
public class StudentGradeCalculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the marks obtained in Physics");
    int physics = sc.nextInt();
    System.out.println("Enter the marks obtained in Chemistry");
    int chemistry = sc.nextInt();
    System.out.println("Enter the marks obtained in Maths");
    int maths = sc.nextInt();
    System.out.println("Enter the marks obtained in English");
    int english = sc.nextInt();
    System.out.println("Enter the marks obtained in Urdu");
    int urdu = sc.nextInt();

    int totalMarks = (physics+chemistry+maths+english+urdu);
    System.out.println("Total Marks Obtained: "+totalMarks);
    int averagePercentage = totalMarks/5;
    System.out.println("Average percentage obtained : "+averagePercentage+"%");

    if(averagePercentage>90){
        System.out.println("Grade Obtained : A");
    }
    else if(averagePercentage>80){
        System.out.println("Grade Obtained : B");
    }
    else if(averagePercentage>70){
        System.out.println("Grade Obtained : C");
    }
    else if(averagePercentage>60){
        System.out.println("Grade Obtained : D");
    }
    else if(averagePercentage>50){
        System.out.println("Grade Obtained : E");
    } else {
        System.out.println("Grade Obtained : F");
    }
    String result;
    result=(averagePercentage>50)?"pass":"fail";
    System.out.println("Result: "+result);
}
}