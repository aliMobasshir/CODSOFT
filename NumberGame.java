
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    Random rm = new Random();
    Scanner sc = new Scanner(System.in);

  while(true){
    int number=rm.nextInt(101);
    int attempts=10;

    System.out.println("Guess the number from 0 to 100 under 10 attempts");

   for(int j=0;j<attempts;j++){
     
      int guess=sc.nextInt();
  
      if (number==guess) {
        System.out.println("correct guess!! the number is "+number);
        break;
      }else if(Math.abs(number-guess)<5){
        System.out.println("almost there");
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
      if (j == attempts - 1) {
        System.out.println("You've used all your attempts. The correct number was " + number);
    }
  }
  
  System.out.println("to play again press 1");
  System.out.println("to exit press 0");
  int z=sc.nextInt();
  
  if(z==0){
   break;
  }
  }
  System.out.println("see you next time");
  }
}
