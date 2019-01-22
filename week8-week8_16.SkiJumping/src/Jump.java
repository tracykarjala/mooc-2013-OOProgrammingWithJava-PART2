import java.util.Arrays;
import java.util.Random;

public class Jump {
    private int distance;
    private int[] scores;

    public Jump(Random random) {
        this.distance = random.nextInt((120 - 60) + 1) + 60;
        this.scores = new int[5];
        for (int i = 0; i < 5; i++) {
            scores[i] = random.nextInt((20 - 10) + 1) + 10;
        }
    }

    public int getDistance() {
        return distance;
    }

    public int[] getScores() {
        return scores;
    }

    public int totalScore() {
        int totalScore = this.distance;
        Arrays.sort(scores);
        for (int i = 1; i < 4; i++) {
            totalScore += scores[i];
        }
        return totalScore;
    }
}
