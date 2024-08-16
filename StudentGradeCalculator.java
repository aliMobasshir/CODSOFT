// TASK-2 , Student Grade Calculator using Java.

import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] subjects ={"Physics","Chemistry","Maths","English","Urdu"};  //tring of subjects
        int[] marks =new int [subjects.length];  //String to store marks input by user
        int totalMarks=0;
        int averagePercentage ;
       
       for(int i=0;i<marks.length;i++){  //loop to ask for user input of the marks
            System.out.println("enter marks obtained in "+ subjects[i]);
            marks[i]=sc.nextInt();  //user input
            totalMarks = totalMarks +marks[i];  //summation of marks
       }
       sc.close();

       System.out.println("Total Marks Obtained: "+totalMarks);
       averagePercentage = totalMarks/5;
       System.out.println("Average percentage obtained : "+averagePercentage+"%");

       //grading
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
    result=(averagePercentage>50)?"pass":"fail";  //result 
    System.out.println("Result: "+result);
    
    }
}
