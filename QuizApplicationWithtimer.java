import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplicationWithTimer {
    private static boolean timeUp; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Following quiz has 10 questions with 10 seconds of time provided to attempt each\n");
       
        String[] questions = {
          "What is the capital of Norway?",
          "Which Mughal emperor was famous as Zinda Pir?",
          "What is the only even prime number?",
          "Who wrote 'To Kill a Mockingbird'?",
          "What is the chemical symbol for gold?",
          "What year did the Titanic sink?",
          "Who painted the Mona Lisa?",
          "What is the largest planet in our solar system?",
          "Which element has the atomic number 1?",
          "What is the longest river in the world?"
      };
      
      String[][] options = {
          {"A. Oslo", "B. New York", "C. London", "D. Kolkata"},
          {"A. Akbar", "B. Babur", "C. Aurangzeb", "D. Shahjahan"},
          {"A. 4", "B. 2", "C. 8", "D. 6"},
          {"A. Harper Lee", "B. J.K. Rowling", "C. Ernest Hemingway", "D. Mark Twain"},
          {"A. Au", "B. Ag", "C. Fe", "D. Pb"},
          {"A. 1905", "B. 1912", "C. 1923", "D. 1935"},
          {"A. Vincent van Gogh", "B. Claude Monet", "C. Pablo Picasso", "D. Leonardo da Vinci"},
          {"A. Earth", "B. Mars", "C. Jupiter", "D. Saturn"},
          {"A. Hydrogen", "B. Helium", "C. Lithium", "D. Beryllium"},
          {"A. Nile", "B. Amazon", "C. Yangtze", "D. Mississippi"}
      };
      
      char[] answers = {'A', 'C', 'B', 'A', 'A', 'B', 'D', 'C', 'A', 'B'};
      

        for (int currentQuestion = 0; currentQuestion < questions.length; currentQuestion++) { //loop for questions
            System.out.println("Q"+(currentQuestion+1)+". "+questions[currentQuestion]);

            for (int j = 0; j < options[currentQuestion].length; j++) {  //loop for options
                System.out.println(options[currentQuestion][j]);          
            }

            timeUp = false; // Reset timeUp at the start of each question
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // This code runs when 10 seconds are up
                    if (!timeUp) {
                        System.out.println("\nTime's up! Press any button to move to the next question\n");
                        timeUp = true; // Indicate that time is up
                    }
                }
            }, 10000); // 10 seconds timer

            

            // Take user's answer
            System.out.print(" type your answer (A/B/C/D) and press enter: ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            // Cancel the timer after user input
            timer.cancel();

            // If time is up, skip checking the answer
            if (timeUp) {
              continue;
          }

            // Check the answer and update the score
            if (userAnswer == answers[currentQuestion]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was option " + answers[currentQuestion] + ".");
            }
        }

        // Display final score
        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.length);
        sc.close();
    }
}
