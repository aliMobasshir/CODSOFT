import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplicationWithtimer {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int score =0;

    String[] questions={"What is the capital of Norway ?","Which Mughal emperor was famous as Zinda Pir ?","What is the only even prime number?"};

    String[][] options={{"A.Oslo","B. New York","C. London","D. Kolkata" },{"A. AKbar","B. Babar","C. Aurangzeb","D. Shahjahan"},{"A. 4","B. 2","C. 8","D. 6"}};

    char[] answers={'A','C','B'};

    for(int currentQuestion=0;currentQuestion<questions.length;currentQuestion++){
        System.out.println(questions[currentQuestion]);

          for(int j=0;j<options[currentQuestion].length;j++){
          System.out.println(options[currentQuestion][j]);
        }
        
        System.out.println("Enter your answer A/B/C/D:");
        char userAnswer = sc.next().charAt(0);

        if (userAnswer == answers[currentQuestion]) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer was option " + answers[currentQuestion] + ".");
        }
      }

      


  }

  

}