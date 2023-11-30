// 14.	Competitors are judged by five judges during the competition.
// Each judge can score 1, 2, 3, 4 or 5 points. Then, the highest score and the lowest score are thrown out.
// The arithmetic mean of the remaining three scores is calculated and this is the competitor's
// final result that is displayed. Create a class diagram for the competition scoring system.
// Define the class and write a program that calculates the final result for three players.

import java.util.Arrays;

public class PlayerScores {
    private int[] scores;

    public void setScores(int[] scores) {
        boolean check = true;
        for (int s: scores) {
            if (s < 1 || s > 5) {
                check = false;
            }
        }
        
        if (scores.length == 5 && check) {
            Arrays.sort(scores);
            this.scores = scores;
        } else {
            System.out.println("The provided scores aren't correct");
        }
    }
    
    public float finalScore() {
        int[] s = Arrays.copyOfRange(scores, 1, scores.length - 1);
        int sum = 0;
        for (int i: s) {
            sum += i;
        }
        return (float) sum / 3;
    }

    public void displayScore() {
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.printf("Final score: %.2f\n", finalScore());
        System.out.println("---");
    }
}