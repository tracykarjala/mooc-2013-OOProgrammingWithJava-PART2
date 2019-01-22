public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft -1 >= 0) {
            daysLeft -= 1;
        }
    }
}
