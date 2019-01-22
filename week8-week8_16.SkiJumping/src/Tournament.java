import java.util.*;

public class Tournament implements Comparator<Jumper> {
    private ArrayList<Jumper> jumpers;
    private Random random;
    private int round;

    public Tournament() {
        this.jumpers = new ArrayList<Jumper>();
        this.random = new Random();
        this.round = 0;
    }

    public void addJumper(Jumper jumper) {
        jumpers.add(jumper);
    }

    public String performRound() {
        this.round++;
        String roundResults = "Results of round " + round + "\n";
        for (Jumper jumper : jumpers) {
            roundResults += "  " + jumper.getName() +"\n";
            Jump jump = new Jump(random);
            jumper.addJump(jump.getDistance());
            roundResults += "    length: " + jump.getDistance() + "\n";
            roundResults += "    judge votes: " + Arrays.toString(jump.getScores()) + "\n";
            jumper.addToScore(jump.totalScore());
        }
        roundResults += "\n";
        return roundResults;
    }

    public int getRound() {
        return round;
    }

    public String jumpingOrder() {
        if (round + 1 > 1) {
            Collections.sort(jumpers, Collections.reverseOrder());
        }
        String jumpingOrder = "Round " + (round + 1) + "\n\nJumping order:\n";
        int i = 1;
        for (Jumper jumper : jumpers) {
            jumpingOrder += "  " + i + ". " + jumper.jumperAndScore();
            i++;
        }
        jumpingOrder += "\n";
        return jumpingOrder;
    }

    public String results() {
        String resultString = "Thanks!\n\nTournament results:\nPosition    Name\n";
        Collections.sort(jumpers);
        int i = 1;
        String jumperString = "";
        for (Jumper jumper : jumpers) {
            jumperString += i + "           " + jumper.jumperAndScore() + jumper.getJumpLengths();
            i++;
        }
        resultString += jumperString;
        return resultString;
    }

    @Override
    public int compare(Jumper o1, Jumper o2) {
        return o1.getScore() - o2.getScore();
    }
}
