// TASK-1 , NumberGame using java.

import java.util.Random;      //importing class for the generation of random number
import java.util.Scanner;     //importing Scanner class

public class NumberGame {
  public static void main(String[] args) {
    Random rm = new Random();                      //object creation of random class
    Scanner sc = new Scanner(System.in);           //object creation of scanner class

    while (true) {   //program under this loop will keep on running until user breaks by pressing 0
      int number = rm.nextInt(101);     //generating random number bounded to 101
      int attempts = 10;                      //number of attempts

      System.out.println("Guess the number from 0 to 100 under 10 attempts");

      for (int j = 0; j < attempts; j++) {  //loop of attempts

        int guess = sc.nextInt();   //taking inputs

        if (number == guess) {
          System.out.println("correct guess!! the number is " + number);
          break;
        } else if (Math.abs(number - guess) < 5) {  //Math.abs() takes the mod of the value(always +ve)
          System.out.println("almost there");
        } else if (Math.abs(number - guess) < 10) {
          System.out.println("very close");
        } else if (Math.abs(number - guess) < 30) {
          System.out.println("not bad");
        } else if (Math.abs(number - guess) < 50) {
          System.out.println(" bad guess");
        } else if (Math.abs(number - guess) < 70) {
          System.out.println("very bad guess");
        } else {
          System.out.println("worst guess");
        }
        if (j == attempts - 1) {  //all attempts used
          System.out.println("You've used all your attempts. The correct number was " + number);
        }
      }

      System.out.println("to play again press 1");  //any input from 1-9 will restart the while loop
      System.out.println("to exit press 0");  //input 0 will break from the while(true) loop
      int z = sc.nextInt();  //taking input to break or restart the while loop

      if (z == 0) {         //writing condition to break from the loop(if it doesn't break,it will restart)
        break;
      }
    }
    System.out.println("See you next time");  
  }
}
