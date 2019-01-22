import java.util.ArrayList;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int score;
    private ArrayList<Integer> jumpLengths;

    public Jumper(String name) {
        this.name = name;
        this.score = 0;
        this.jumpLengths = new ArrayList<Integer>();
    }

    public void addToScore(int value) {
        this.score += value;
    }

    public void addJump(int distance) {
        jumpLengths.add(distance);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getJumpLengths() {
        String jumpLengthString = "            jump lengths: ";
        int i = 0;
        while (i < jumpLengths.size()) {
            jumpLengthString += jumpLengths.get(i) + " m";
            if (i < jumpLengths.size() - 1) {
                jumpLengthString += ", ";
            }
            i++;
        }
        jumpLengthString += "\n";
        return jumpLengthString;
    }

    public String jumperAndScore() {
        return this.name + " (" + this.score + " points)\n";
    }

    @Override
    public int compareTo(Jumper o) {
        return o.getScore() - this.score;
    }
}
