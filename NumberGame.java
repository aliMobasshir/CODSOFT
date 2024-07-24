
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    Random rm = new Random();
    Scanner sc=new Scanner(System.in);

  int number=rm.nextInt(100);

  for(int j=0;j<5;j++){
    int guess=sc.nextInt();
  System.out.println("guess the number");
    if (number==guess) {
      System.out.println("correct guess");
      break;
    }else if(Math.abs(number-guess)<10){
      System.out.println("very close");
    }else if(Math.abs(number-guess)<30){
        System.out.println("not bad");
    }else if(Math.abs(number-guess)<50){
        System.out.println(" bad guess");
    }else if(Math.abs(number-guess)<70){
        System.out.println("very bad guess");} 
    else{
      System.out.println("worst guess");
    }   
  }
  System.out.println("right aswer is "+number); 
  }
}
