import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class temp {
    private static int score = 0;
    private static int currentQuestion = 0;
    private static boolean answered = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and options
        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "What is the largest ocean on Earth?",
        };

        String[][] options = {
                {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
                {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
                {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
        };

        char[] answers = {'C', 'B', 'D'}; // Correct answers

        // Quiz loop
        for (currentQuestion = 0; currentQuestion < questions.length; currentQuestion++) {
            System.out.println(questions[currentQuestion]);

            // Display options
            for (int j = 0; j < options[currentQuestion].length; j++) {
                System.out.println(options[currentQuestion][j]);
            }

            // Start timer for the question
            answered = false;
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!answered) {
                        System.out.println("\nTime's up! Moving to the next question...\n");
                        answered = true;
                    }
                }
            }, 10000); // 10 seconds timer

            // Take user's answer
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));
            if (answered) {
                continue; // If time is up, skip the scoring
            }
            answered = true;
            timer.cancel();

            // Check answer
            if (userAnswer == answers[currentQuestion]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was option " + answers[currentQuestion] + ".\n");
            }
        }

        // Display final score
        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
